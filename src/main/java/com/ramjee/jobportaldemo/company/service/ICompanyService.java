package com.ramjee.jobportaldemo.company.service;

import com.ramjee.jobportaldemo.dto.CompanyDto;
import com.ramjee.jobportaldemo.entity.Company;

import java.util.List;

public interface ICompanyService {

    List<CompanyDto> getAllCompanies();

    boolean createCompany(CompanyDto companyDto);

    List<CompanyDto> getAllCompaniesForAdmin();

    boolean updateCompanyDetails(Long id, CompanyDto companyDto);

    void deleteCompanyById(Long id);
}
