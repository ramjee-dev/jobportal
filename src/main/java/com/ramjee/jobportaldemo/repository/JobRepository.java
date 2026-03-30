package com.ramjee.jobportaldemo.repository;

import com.ramjee.jobportaldemo.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}