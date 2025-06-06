package com.example.Pet_Adoption_System.Repository;
import com.example.Pet_Adoption_System.Model.ApplyPet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplyPetRepository extends MongoRepository<ApplyPet, String> {
}
