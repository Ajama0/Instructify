package com.example.Instructify.Model;


import com.example.Instructify.enums.Status;
import com.example.Instructify.enums.Transmission;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Instructor_Details")
public class Instructor {


    @SequenceGenerator(name="Instructor_sequence",
            sequenceName = "Instructor_sequence",
            allocationSize = 1
    )

    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "Instructor_sequence"
    )
    @Id
    @Column(name="Instructor_id")
    private Long InstructorId;


    //the user_id is referencing the users who signed up as an instructor
    @OneToOne
    @JoinColumn(name="fk_profile_id")
    private Profiles profiles;

    @Column(name = "experience_Years")
    private String experience;

    @Column(name = "bio")
    private String Bio;




    @Enumerated(EnumType.STRING)
    @Column(name = "Verification_status")
    private Status status;



    @Override
    public String toString() {
        return "Instructor{" +
                "InstructorId=" + InstructorId +
                ", profiles=" + profiles +
                ", status=" + status +
                '}';
    }
}
