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


//we don't want a user assigning themselves a Role upon registration. so we create a Dto.
//users will only be required to enter username and password.

private String Email;
private String password;



}
