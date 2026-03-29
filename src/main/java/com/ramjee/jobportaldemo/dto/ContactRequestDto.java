package com.ramjee.jobportaldemo.dto;

import java.io.Serializable;

public record ContactRequestDto(String email, String message, String name, String subject,
                                String userType) implements Serializable {
}
