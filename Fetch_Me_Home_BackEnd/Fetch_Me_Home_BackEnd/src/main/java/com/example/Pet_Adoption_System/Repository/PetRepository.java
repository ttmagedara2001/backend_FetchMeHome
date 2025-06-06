package com.example.Pet_Adoption_System.Repository;

import com.example.Pet_Adoption_System.Model.Pet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PetRepository extends MongoRepository<Pet, String> {
    // Additional custom queries can be added here if needed
}
