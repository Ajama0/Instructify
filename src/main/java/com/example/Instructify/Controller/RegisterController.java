package com.example.Instructify.Controller;


import com.example.Instructify.Model.Users;
import com.example.Instructify.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path="/Instructify")
@RestController
public class RegisterController {


    @Autowired
    private RegistrationService registrationService;

//    @PostMapping(path="/Register")
//    public ResponseEntity<Users>Registration(@RequestBody Users user){
//        Users userRegister = registrationService.Register(user);
//        return ResponseEntity.ok(userRegister);


}
