package com.ramjee.jobportaldemo.repository;

import com.ramjee.jobportaldemo.entity.Company;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;

public interface CompanyRepository extends JpaRepository<Company,Long> {

    @CacheEvict(value = "companies",allEntries = true)
     Company save(Company entity);

    @CacheEvict(value = "companies",allEntries = true)
    void deleteById(Long id);

    @CacheEvict(value = "companies",allEntries = true)
    @Modifying(clearAutomatically = true, flushAutomatically = true)
    int updateCompanyDetails(
            @Param("id") Long id,
            @Param("name") String name,
            @Param("logo") String logo,
            @Param("industry") String industry,
            @Param("size") String size,
            @Param("rating") BigDecimal rating,
            @Param("locations") String locations,
            @Param("founded") Integer founded,
            @Param("description") String description,
            @Param("employees") Integer employees,
            @Param("website") String website
    );
}
