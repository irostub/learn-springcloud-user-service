package com.irostub.userservice;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final Environment environment;
    private final Greeting greeting;

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
