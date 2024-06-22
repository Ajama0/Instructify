package com.example.Instructify.Repository;

import com.example.Instructify.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {

    @Query("Select s from Users s Where s.Email = ?1")
    Optional<Users> findUser(String username);

    

}
