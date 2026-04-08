package com.ramjee.jobportaldemo.job.service.impl;

import com.ramjee.jobportaldemo.dto.JobDto;
import com.ramjee.jobportaldemo.entity.Job;
import com.ramjee.jobportaldemo.entity.JobPortalUser;
import com.ramjee.jobportaldemo.job.service.IJobService;
import com.ramjee.jobportaldemo.repository.JobPortalUserRepository;
import com.ramjee.jobportaldemo.repository.JobRepository;
import com.ramjee.jobportaldemo.util.ApplicationUtility;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class JobServiceImpl implements IJobService {

    private final JobRepository jobRepository;
    private final JobPortalUserRepository userRepository;

    @Override
    @Transactional
    public JobDto createJob(JobDto jobDto, String employerEmail) {
        // Validate employer and get their company
        JobPortalUser employer = userRepository.findJobPortalUserByEmail(employerEmail)
                .orElseThrow(() -> new RuntimeException("Employer not found"));
        if (employer.getCompany() == null) {
            throw new RuntimeException("Employer does not have a company assigned. Please contact admin.");
        }
        Job job = tranformDtoToEntity(jobDto);
        job.setPostedDate(Instant.now());
        job.setApplicationsCount(0);
        job.setStatus("DRAFT");
        job.setCompany(employer.getCompany());
        Job savedJob = jobRepository.save(job);
        return ApplicationUtility.transformJobToDto(savedJob);
    }

    private Job tranformDtoToEntity(JobDto jobDto) {
        Job job = new Job();
        BeanUtils.copyProperties(jobDto, job);
        return job;
    }
}
