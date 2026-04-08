package com.ramjee.jobportaldemo.job.controller;

import com.ramjee.jobportaldemo.dto.JobDto;
import com.ramjee.jobportaldemo.job.service.IJobService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
@RequiredArgsConstructor
public class JobController {

    private final IJobService jobService;

    @PostMapping(path = "/employer", version = "1.0")
    public ResponseEntity<JobDto> createJob(@RequestBody @Valid JobDto jobDto, Authentication authentication) {
        String employerEmail = authentication.getName();
        JobDto createdJob = jobService.createJob(jobDto, employerEmail);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdJob);
    }

}

