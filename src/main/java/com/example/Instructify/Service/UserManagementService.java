package com.example.Instructify.Service;

import com.example.Instructify.DTOS.UserDTOs;
import com.example.Instructify.Model.Users;
import com.example.Instructify.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserManagementService {

    private final UserRepository userRepository;

    @Autowired
    public UserManagementService(UserRepository userRepository){
        this.userRepository=userRepository;
    }


   //we encapsulate some data being transferred as we may not
//    public List<UserDTOs> getAllUsers(){
//        List<Users> getAllUsers = userRepository.findAll();
//        return getAllUsers.stream()
//                .map(user ->
//                        UserDTOs.builder()
//                                .id(user.getId())
//                                .username(user.getUsername())
//                                .dob(user.getDob())
//                                .position(user.getPosition())
//                                .build())
//                .collect(Collectors.toList());
//    }
//
//
//    //this will only be allowed By an admin. Configured in security
//    public void DeleteUsers(Long id){
//        Optional<Users> DeleteById=userRepository.findById(id);
//        if(DeleteById.isPresent()){
//            Users userUponDeletion = DeleteById.get();
//            userRepository.delete(userUponDeletion);
//        }
//
//        throw new IllegalArgumentException("There is no such User" + id);
//
//    }

}
