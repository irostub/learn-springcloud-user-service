package com.irostub.userservice.service;

import com.irostub.userservice.dto.UserDto;
import com.irostub.userservice.entity.Users;
import com.irostub.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserDto createUser(UserDto userDto) {
        userDto.setUserId(UUID.randomUUID().toString());
        Users users = userDto.toEntity();

        Users save = userRepository.save(users);
        return new UserDto(save);
    }
}
