package com.example.Pet_Adoption_System.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Pet_Adoption_System.Model.ERole;
import com.example.Pet_Adoption_System.Model.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
