package com.example.Pet_Adoption_System.Service;

import com.example.Pet_Adoption_System.Model.ApplyPet;
import com.example.Pet_Adoption_System.Repository.ApplyPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplyPetService {

    @Autowired
    private ApplyPetRepository applyPetRepository;

    public ApplyPet saveApplication(ApplyPet applyPet) {
        return applyPetRepository.save(applyPet);
    }

    public List<ApplyPet> getAllApplications() {
        return applyPetRepository.findAll();
    }

    public ApplyPet getApplicationById(String id) {
        return applyPetRepository.findById(id).orElse(null);
    }

    public ApplyPet updateApplication(String id, ApplyPet applyPetDetails) {
        ApplyPet existingApplication = applyPetRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application not found"));

        // Update the existing application fields with the new values
        existingApplication.setFullName(applyPetDetails.getFullName());
        existingApplication.setTelephone(applyPetDetails.getTelephone());
        existingApplication.setEmail(applyPetDetails.getEmail());
        existingApplication.setAddress(applyPetDetails.getAddress());
        existingApplication.setOtherPetsDetails(applyPetDetails.getOtherPetsDetails());
        existingApplication.setNeuteredPets(applyPetDetails.getNeuteredPets());
        existingApplication.setSecureGarden(applyPetDetails.getSecureGarden());
        existingApplication.setAnimalSleepLocation(applyPetDetails.getAnimalSleepLocation());
        existingApplication.setWorkHours(applyPetDetails.getWorkHours());
        existingApplication.setSurrenderReason(applyPetDetails.getSurrenderReason());
        existingApplication.setAdoptionAgreement(applyPetDetails.getAdoptionAgreement());
        existingApplication.setChildrenUnder16(applyPetDetails.getChildrenUnder16());
        existingApplication.setHomeOwnership(applyPetDetails.getHomeOwnership());
        existingApplication.setLeaseAllowsPets(applyPetDetails.getLeaseAllowsPets());
        existingApplication.setNearMainRoad(applyPetDetails.getNearMainRoad());

        // Save and return updated application
        return applyPetRepository.save(existingApplication);
    }

    public void deleteApplication(String id) {
        applyPetRepository.deleteById(id);
    }
}
