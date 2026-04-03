package com.ramjee.jobportaldemo.repository;

import com.ramjee.jobportaldemo.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    List<Contact> findContactsByStatus(String status);

    List<Contact> findContactsByStatusOrderByCreatedAtAsc(String status);
}