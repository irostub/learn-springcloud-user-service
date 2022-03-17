package com.irostub.userservice.dto;

import com.irostub.userservice.entity.Users;
import com.irostub.userservice.vo.RequestUser;
import lombok.Data;

import java.util.Date;

@Data
public class UserDto {
    private String email;
    private String name;
    private String pwd;
    private String userId;
    private Date createdAt;

    private String encryptedPwd;

    public UserDto(RequestUser requestUser) {
        this.email = requestUser.getMail();
        this.name = requestUser.getName();
        this.pwd = requestUser.getPwd();
    }

    public Users toEntity(){
        return new Users(email, name, userId, "encrypted_"+pwd);
    }

    public UserDto(Users users) {
        this.email = users.getEmail();
        this.name = users.getName();
        this.pwd = users.getEncryptedPwd();
        this.userId = users.getUserId();
    }
}
