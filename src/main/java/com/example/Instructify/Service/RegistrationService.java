package com.example.Instructify.Service;


import com.example.Instructify.DTOS.UserDTOs;
import com.example.Instructify.Model.Document;
import com.example.Instructify.Model.Instructor;
import com.example.Instructify.Model.Users;
import com.example.Instructify.Repository.DocumentRepository;
import com.example.Instructify.Repository.InstructorRepository;
import com.example.Instructify.Repository.UserRepository;
import com.example.Instructify.enums.Position;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RegistrationService {


    private final UserRepository userRepository;
    private final DocumentRepository documentRepository;
    private final PasswordEncoder passwordEncoder;
    private final InstructorRepository instructorRepository;



    @Autowired
    public RegistrationService(UserRepository userRepository,
                               DocumentRepository documentRepository,
                               InstructorRepository instructorRepository,
                               PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.documentRepository=documentRepository;
        this.instructorRepository=instructorRepository;
        this.passwordEncoder=passwordEncoder;


    }

    private final int MIN_LENGTH=5;
    private final int MAX_LENGTH =15;

//    public Users Register(Users user) {
//        //checking the password length.
//        if(user.getPassword().length()>=MIN_LENGTH && user.getPassword().length()<=MAX_LENGTH) {
//
//            //if a Teacher(instructor) signs up we ensure then we save that user to the Instructor repo
//            if (user.getPosition().equals(Position.TEACHER)){
//                try {
//                    Instructor instructor = new Instructor();
//                    instructor.setUsers(user);
//                    instructorRepository.save(instructor);
//
//                } catch (Exception e) {
//                    throw new IllegalArgumentException("Error saving user" + e.getMessage());
//                }
//
//                //hash the users password upon every entry
//                user.setPassword(passwordEncoder.encode(user.getPassword()));
//                userRepository.save(user);
//
//
//            }
//        }
//        //if the wanted requirements are not provided throw this error
//        throw new IllegalArgumentException("Please Ensure the Correct inputs are Entered");
//    }
//
//
//
//
//    // here we will allow users to upload documents.This is to validate Instructors
//    public Document UploadDocuments(MultipartFile file) {
//      return null;
//    }
//
//
//
//
//
//
//
//



}
