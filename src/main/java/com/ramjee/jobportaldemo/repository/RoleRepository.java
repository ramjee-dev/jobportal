package com.ramjee.jobportaldemo.repository;

import com.ramjee.jobportaldemo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}