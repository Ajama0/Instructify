package com.example.Instructify.Model;


import com.example.Instructify.enums.Role;
import com.example.Instructify.enums.Position;
import com.example.Instructify.enums.Transmission;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Users")
public class Users implements UserDetails{





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

    @Column(name="Email", nullable = false)
    private String Email;

    @Column(name="password", nullable = false)
    private String password;


    @Enumerated(EnumType.STRING)
    private Role role;


    public Users(String Email, String Password){
        this.Email = Email;
        this.password = Password;
    }


    public Users(String Email, String Password, Role role){
        this.Email=Email;
        this.password = Password;
        this.role = role;
    }


    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", Email='" + Email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getUsername() {
        return Email;
    }



    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
