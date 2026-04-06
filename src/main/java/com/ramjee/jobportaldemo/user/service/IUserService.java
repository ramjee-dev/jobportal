package com.ramjee.jobportaldemo.user.service;

import com.ramjee.jobportaldemo.dto.UserDto;

import java.util.Optional;

public interface IUserService {

    /**
     * Search for a user by email address
     *
     * @param email the email address to search for
     * @return Optional containing UserDto if found
     */
    Optional<UserDto> searchUserByEmail(String email);

}
