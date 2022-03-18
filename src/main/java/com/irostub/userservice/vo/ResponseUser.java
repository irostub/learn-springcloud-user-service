package com.irostub.userservice.vo;

import com.irostub.userservice.dto.UserDto;
import lombok.Data;

@Data
public class ResponseUser {
    private String mail;
    private String userId;
    private String name;

    public ResponseUser(UserDto userDto) {
        this.mail = userDto.getEmail();
        this.userId = userDto.getUserId();
        this.name = userDto.getName();
    }
}
