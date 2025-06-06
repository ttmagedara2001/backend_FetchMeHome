package com.example.Pet_Adoption_System.Repository;

import com.example.Pet_Adoption_System.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
    // Optional <User> findByUsername(String name);
    // Boolean existsByUsername(String name);
  
    // Boolean existsByEmail(String email);
}
