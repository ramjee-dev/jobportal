package com.ramjee.jobportaldemo.repository;

import com.ramjee.jobportaldemo.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
