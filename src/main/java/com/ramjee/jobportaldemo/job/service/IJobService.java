package com.ramjee.jobportaldemo.job.service;

import com.ramjee.jobportaldemo.dto.JobDto;

import java.util.List;

public interface IJobService {

    /**
     * Create a new job for the employer's company
     * @param jobDto the job data
     * @param employerEmail the email of the employer creating the job
     * @return created JobDto
     */
    JobDto createJob(JobDto jobDto, String employerEmail);


    /**
     * Get all jobs posted by the employer's company
     * @param employerEmail the email of the employer
     * @return list of jobs
     */
    List<JobDto> getEmployerJobs(String employerEmail);
}
