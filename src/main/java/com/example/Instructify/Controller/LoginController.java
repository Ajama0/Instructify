package com.example.Instructify.Controller;


import com.example.Instructify.Model.Users;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/api/v1")
public class LoginController {

    /**
     * endpoint that requires authentication
     * can be  viewed by authorised users and admins
     */
    @GetMapping(path= "/AllUsers")
    public List<Users> EveryoneAccess(){
        List<Users> usersList = new ArrayList<>();
        Users user1 = new Users("jacob@123.com");
        Users user2 = new Users("harriet1@example.com");

        usersList.add(user1);
        usersList.add(user2);

        return usersList;


    }

    @GetMapping(path="/")
    public String UserAccess(){
        return "Welcome to Admins only Page";
    }
}
