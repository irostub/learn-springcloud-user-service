package com.irostub.userservice;

import com.irostub.userservice.dto.UserDto;
import com.irostub.userservice.service.UserService;
import com.irostub.userservice.vo.RequestUser;
import com.irostub.userservice.vo.ResponseUser;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class UserController {
    private final Environment environment;
    private final Greeting greeting;
    private final UserService userService;

    @PostMapping
    public ResponseEntity<ResponseUser> createUser(@RequestBody RequestUser user) {
        UserDto createdUser = userService.createUser(new UserDto(user));
        return ResponseEntity.ok().body(new ResponseUser(createdUser));
    }

    @GetMapping("/status")
    public String status(){
        return "User Service working";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return greeting.getMessage();
//        return environment.getProperty("greeting.message");
    }
}
