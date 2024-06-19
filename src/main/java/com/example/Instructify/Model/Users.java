package com.example.Instructify.Model;


import com.example.Instructify.enums.Role;
import com.example.Instructify.enums.Position;
import com.example.Instructify.enums.Transmission;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="Users")
public class Users {


    @Id
    @SequenceGenerator(name="users_sequence",
            sequenceName = "",
            allocationSize = 1
    )

    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "users_generator"
    )




    @Column(name="user_id")
    private Long id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="location")
    private String location;

    private String Email;

    @Column(name="Dob")
    private LocalDate dob;

    @Column(name="phone_number")
    private String PhoneNumber;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Enumerated(EnumType.STRING)
    private Transmission transmission; //Manual or Auto

   @Enumerated(EnumType.STRING)
    private Position position;















}
