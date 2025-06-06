package com.example.Pet_Adoption_System.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Pet_Adoption_System.Model.RUser;

public interface RUserRepository extends MongoRepository<RUser, String> {
    Optional<RUser> findByUsername(String username);
    Optional<RUser> findByEmail(String email);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}

