package com.example.Pet_Adoption_System.Security.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Pet_Adoption_System.Model.RUser;
import com.example.Pet_Adoption_System.Repository.RUserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    RUserRepository r_userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
        RUser r_user = r_userRepository.findByUsername(usernameOrEmail)
                .orElseGet(() -> r_userRepository.findByEmail(usernameOrEmail)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username or email: " + usernameOrEmail)));

        return UserDetailsImpl.build(r_user);
    }
}