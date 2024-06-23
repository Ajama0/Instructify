package com.example.Instructify.Security;

import com.example.Instructify.Model.Users;
import com.example.Instructify.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

   private final UserRepository userRepository;

    @Autowired
   public CustomUserDetailsService(UserRepository userRepository){
        this.userRepository=userRepository;
    }



    @Override
    public UserDetails loadUserByUsername(String email) {
        Optional<Users> FindUser = userRepository.findUser(email);
        if (FindUser.isEmpty()){
            throw new UsernameNotFoundException(email + " does not exist");
        }
        Users userFound = FindUser.get();

        return new Users(userFound.getUsername(),
                    userFound.getPassword(),
                    userFound.getRole()
                );

    }



}
