package com.ramjee.jobportaldemo.repository;

import com.ramjee.jobportaldemo.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}