package com.example.Instructify.Configuration;


import com.example.Instructify.Model.Users;
import com.example.Instructify.Repository.InstructorRepository;
import com.example.Instructify.Repository.ProfileRepository;
import com.example.Instructify.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class UserConfig {

    public UserRepository userRepository;


    public UserConfig(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){
        return args ->{
            Users user1 = new Users("jacobAnt@gmail.com", "password123");
            Users user2 = new Users("harryOli@exmaple.com", "test222");

            List<Users> savedUsers = new ArrayList<>();
            savedUsers.add(user1);
            savedUsers.add(user2);
            userRepository.saveAll(savedUsers);



        };

    }
}
