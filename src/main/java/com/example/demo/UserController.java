package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    public List<UserDto> readAll() {
        List<UserDto> userDtos;
        userDtos = userService.readAllUsers().stream().map(UserDto::new).toList();
        return userDtos;
    }
}
