package com.example.Instructify.Configuration;


import com.example.Instructify.Model.Users;
import com.example.Instructify.Repository.InstructorRepository;
import com.example.Instructify.Repository.ProfileRepository;
import com.example.Instructify.Repository.UserRepository;
import com.example.Instructify.enums.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class UserConfig {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public UserConfig(UserRepository userRepository, PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository, PasswordEncoder passwordEncoder){
        return args ->{
            Users user1 = new Users("jacobAnt@gmail.com", passwordEncoder.encode("admin123")
                    ,Role.ADMIN);
            Users user2 = new Users("harryOli@exmaple.com", passwordEncoder.encode("user123"),
                    Role.USER);

            List<Users> savedUsers = new ArrayList<>();
            savedUsers.add(user1);
            savedUsers.add(user2);
            userRepository.saveAll(savedUsers);



        };

    }
}
