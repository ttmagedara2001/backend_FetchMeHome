package com.example.Pet_Adoption_System.Service;

import com.example.Pet_Adoption_System.Model.Blog;
import com.example.Pet_Adoption_System.Repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    public Blog addBlog(Blog blog) {
        blog.setApproved(false); // New blogs are not approved by default
        blog.setCreatedAt(LocalDateTime.now());
        return blogRepository.save(blog);
    }

    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    public Blog approveBlog(String id) {
        Blog blog = blogRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Blog not found"));

        if (!blog.isApproved()) {
            blog.setApproved(true);
            blog.setCreatedAt(LocalDateTime.now()); // Update timestamp when approved
            return blogRepository.save(blog);
        }
        return blog;
    }

    public List<Blog> getApprovedBlogs() {
        return blogRepository.findByApprovedTrueOrderByCreatedAtDesc();
    }

    public void deleteBlog(String id) {
        blogRepository.deleteById(id);
    }
}