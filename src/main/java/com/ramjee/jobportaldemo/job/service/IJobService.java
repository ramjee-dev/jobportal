package com.ramjee.jobportaldemo.job.service;

import com.ramjee.jobportaldemo.dto.JobDto;

public interface IJobService {

    /**
     * Create a new job for the employer's company
     * @param jobDto the job data
     * @param employerEmail the email of the employer creating the job
     * @return created JobDto
     */
    JobDto createJob(JobDto jobDto, String employerEmail);


}
