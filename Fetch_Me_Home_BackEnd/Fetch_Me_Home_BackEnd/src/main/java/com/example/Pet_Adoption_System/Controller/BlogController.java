package com.example.Pet_Adoption_System.Controller;

import com.example.Pet_Adoption_System.Model.Blog;
import com.example.Pet_Adoption_System.Service.BlogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blogs")
@CrossOrigin
@Tag(name="BlogController",description="To perform operations on Blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    // Admin-only endpoints
    @Operation(
            summary = "POST operation on Blogs",
            description = "It is used to save Blogs in database"
    )
    @PostMapping
    public ResponseEntity<Blog> addBlog(@RequestBody Blog blog) {
        Blog savedBlog = blogService.addBlog(blog);
        return ResponseEntity.ok(savedBlog);
    }

    @Operation(
            summary = "GET operation on Blogs",
            description = "It is used to get Blogs to admin panel from database"
    )

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public ResponseEntity<List<Blog>> getAllBlogsForAdmin() {
        List<Blog> blogs = blogService.getAllBlogs();
        return ResponseEntity.ok(blogs);
    }

    @Operation(
            summary = "PUT operation on Blogs",
            description = "It is used to update Blogs approved details in database"
    )

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/approve/{id}")
    public ResponseEntity<Blog> approveBlog(@PathVariable String id) {
        Blog approvedBlog = blogService.approveBlog(id);
        return ResponseEntity.ok(approvedBlog);
    }

    @Operation(
            summary = "DELETÊ operation on Blogs",
            description = "It is used to delete Blogs in database"
    )

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBlog(@PathVariable String id) {
        blogService.deleteBlog(id);
        return ResponseEntity.ok().build();
    }

    // Public endpoint
    @Operation(
            summary = "GET operation on Blogs",
            description = "It is used to get Blogs form database"
    )
    @GetMapping("/public")
    public ResponseEntity<List<Blog>> getApprovedBlogs() {
        List<Blog> blogs = blogService.getApprovedBlogs();
        return ResponseEntity.ok(blogs);
    }
}