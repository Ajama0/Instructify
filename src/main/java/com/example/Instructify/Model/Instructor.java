package com.example.Instructify.Model;


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

    @Id
    @SequenceGenerator(name="Instuctor_sequence",
            sequenceName = "Instructor_sequence",
            allocationSize = 1
    )

    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "Instructor_sequence"
    )

    @Column(name="Instructor_id")
    private Users users;

    //the user_id is referencing the users who signed up as an instructor
    @OneToOne
    @JoinColumn(name="Instructor_id")
    private Users users;


    @Override
    public String toString() {
        return "Instructor{" +
                "InstructorId=" + InstructorId +
                ", users=" + users +
                '}';
    }
}
