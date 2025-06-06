package com.example.Pet_Adoption_System.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Adoptions")
@Data
@NoArgsConstructor
public class ApplyPet {
    @Id
    private String id;

    private String fullName;
    private String telephone;
    private String email;
    private String address;
    private String otherPetsDetails;
    private String neuteredPets;
    private String secureGarden;
    private String animalSleepLocation;
    private String workHours;
    private String surrenderReason;
    private String adoptionAgreement;
    private String childrenUnder16;
    private String homeOwnership;
    private String leaseAllowsPets;
    private String nearMainRoad;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOtherPetsDetails() {
        return otherPetsDetails;
    }

    public void setOtherPetsDetails(String otherPetsDetails) {
        this.otherPetsDetails = otherPetsDetails;
    }

    public String getNeuteredPets() {
        return neuteredPets;
    }

    public void setNeuteredPets(String neuteredPets) {
        this.neuteredPets = neuteredPets;
    }

    public String getSecureGarden() {
        return secureGarden;
    }

    public void setSecureGarden(String secureGarden) {
        this.secureGarden = secureGarden;
    }

    public String getAnimalSleepLocation() {
        return animalSleepLocation;
    }

    public void setAnimalSleepLocation(String animalSleepLocation) {
        this.animalSleepLocation = animalSleepLocation;
    }

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    public String getSurrenderReason() {
        return surrenderReason;
    }

    public void setSurrenderReason(String surrenderReason) {
        this.surrenderReason = surrenderReason;
    }

    public String getAdoptionAgreement() {
        return adoptionAgreement;
    }

    public void setAdoptionAgreement(String adoptionAgreement) {
        this.adoptionAgreement = adoptionAgreement;
    }

    public String getChildrenUnder16() {
        return childrenUnder16;
    }

    public void setChildrenUnder16(String childrenUnder16) {
        this.childrenUnder16 = childrenUnder16;
    }

    public String getHomeOwnership() {
        return homeOwnership;
    }

    public void setHomeOwnership(String homeOwnership) {
        this.homeOwnership = homeOwnership;
    }

    public String getLeaseAllowsPets() {
        return leaseAllowsPets;
    }

    public void setLeaseAllowsPets(String leaseAllowsPets) {
        this.leaseAllowsPets = leaseAllowsPets;
    }

    public String getNearMainRoad() {
        return nearMainRoad;
    }

    public void setNearMainRoad(String nearMainRoad) {
        this.nearMainRoad = nearMainRoad;
    }
}
