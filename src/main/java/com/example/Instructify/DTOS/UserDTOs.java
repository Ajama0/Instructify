package com.example.Instructify.DTOS;


import com.example.Instructify.enums.Position;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTOs {


    private Long id;
    private String username;
    private LocalDate dob;
    private Position position;


}
