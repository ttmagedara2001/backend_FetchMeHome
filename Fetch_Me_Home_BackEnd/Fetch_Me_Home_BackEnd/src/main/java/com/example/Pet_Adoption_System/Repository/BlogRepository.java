package com.example.Pet_Adoption_System.Repository;

import com.example.Pet_Adoption_System.Model.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface BlogRepository extends MongoRepository<Blog, String> {
    List<Blog> findByApprovedTrueOrderByCreatedAtDesc();
}