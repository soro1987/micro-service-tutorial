package com.soro.api.users.service;

import com.soro.api.users.shared.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsersService extends UserDetailsService {
    UserDto createUser(UserDto userDetails);

    UserDto getUserDetailsByEmail(String userName);
    UserDto getUserByUserId(String userId);
}
