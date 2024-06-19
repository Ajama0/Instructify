package com.example.Instructify.Model;


import com.example.Instructify.enums.Position;
import com.example.Instructify.enums.Transmission;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Profiles")
public class Profiles {


    @SequenceGenerator(name= "profiles_sequence" ,
            sequenceName = " " ,
            allocationSize = 1
    )

    @Id
    @Column(name = "Profile_id")
    private Long Profile_id;


    //1-1 relationship with the users table
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_users_id")
    private Users users;

    @Column(name="location")
    private String location;

    @Column(name="phone_number")
    private String PhoneNumber;

    @Column(name="Dob")
    private LocalDate dob;

    //private List<String> Languages;

    @Enumerated(EnumType.STRING)
    @Column(name = "position")
    private Position position;

    //defines whether user is a manual or auto
    @Enumerated(EnumType.STRING)
    @Column(name = "Transmission")
    private Transmission transmission;




}
