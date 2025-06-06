package com.example.Pet_Adoption_System.Service;

import com.example.Pet_Adoption_System.Model.User;
import com.example.Pet_Adoption_System.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(String id, User user) {
        if (userRepository.existsById(id)) {
            user.setId(id);
            return userRepository.save(user);
        }
        return null; // Return null or throw an exception if not found
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }



    // public User registerUser(User user) {
    //     // Check if email already exists
    //     User existingUser = userRepository.findByEmail(user.getEmail());
    //     if (existingUser != null) {
    //         throw new RuntimeException("Email already registered.");
    //     }

    //     // Check if password and confirmPassword match
    //     if (!user.getPassword().equals(user.getConfirmPassword())) {
    //         throw new RuntimeException("Passwords do not match.");
    //     }

    //     return userRepository.save(user);
    // }

  

    // public User authenticateUser(String email, String password) {
    //     User user = userRepository.findByEmail(email);

    //     // Verify the plain-text password (not secure; better to hash passwords in Petion)
    //     if (user != null && user.getPassword().equals(password)) {
    //         return user;
    //     }
    //     return null;
    // }

    // public User updateUser(String id, User user) {
    //     User existingUser = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    //     existingUser.setName(user.getName());
    //     existingUser.setEmail(user.getEmail());
    //     existingUser.setPassword(user.getPassword()); // Ideally, hash the password before saving
    //     return userRepository.save(existingUser);
    // }

    // public void deleteUser(String id) {
    //     User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    //     userRepository.delete(user);
    // }


}
