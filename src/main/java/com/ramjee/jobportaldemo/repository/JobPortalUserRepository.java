package com.ramjee.jobportaldemo.repository;

import com.ramjee.jobportaldemo.entity.JobPortalUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPortalUserRepository extends JpaRepository<JobPortalUser, Long> {
}