package com.ramjee.jobportaldemo.dto;

public record LoginResponseDto(String message, UserDto user, String jwtToken) {
}
