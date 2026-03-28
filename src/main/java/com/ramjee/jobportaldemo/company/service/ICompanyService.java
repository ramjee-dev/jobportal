package com.ramjee.jobportaldemo.company.service;

import com.ramjee.jobportaldemo.dto.CompanyDto;
import com.ramjee.jobportaldemo.entity.Company;

import java.util.List;

public interface ICompanyService {

    List<CompanyDto> getAllCompanies();
}
