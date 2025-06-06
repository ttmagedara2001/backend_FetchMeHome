package com.example.Pet_Adoption_System.Service;

import com.example.Pet_Adoption_System.Model.Pet;
import com.example.Pet_Adoption_System.Repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public Pet addPet(Pet pet) {
        // Log the pet details before saving
        System.out.println("Saving Pet: " + pet);
        return petRepository.save(pet);
    }

    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

    public Pet getPetById(String id) {
        return petRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pet not found"));
    }

    public Pet updatePet(String id, Pet petDetails) {
        Pet existingPet = petRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pet not found"));

        // Update pet properties
        existingPet.setName(petDetails.getName());
        existingPet.setSpecies(petDetails.getSpecies());
        existingPet.setAge(petDetails.getAge());
        existingPet.setSex(petDetails.getSex());
        existingPet.setBreed(petDetails.getBreed());
        existingPet.setColor(petDetails.getColor());
        existingPet.setLocation(petDetails.getLocation());
        existingPet.setDescription(petDetails.getDescription());
        existingPet.setImageUrl(petDetails.getImageUrl());

        // Save updated pet
        return petRepository.save(existingPet);
    }

    public void deletePet(String id) {
        petRepository.deleteById(id);
    }
}
