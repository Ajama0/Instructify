package com.example.Instructify.Repository;

import com.example.Instructify.Model.Profiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profiles, Long> {
}
