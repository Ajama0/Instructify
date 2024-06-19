package com.example.Instructify.Repository;

import com.example.Instructify.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DocumentRepository extends JpaRepository<Users,Long> {

    Optional<Users> findById(Long id);
}
