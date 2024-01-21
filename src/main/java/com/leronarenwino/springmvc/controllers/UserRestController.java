package com.leronarenwino.springmvc.controllers;

import com.leronarenwino.springmvc.models.User;
import com.leronarenwino.springmvc.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details(){

        User user = new User("Leron", "Arenwino");

        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hello World");

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list(){

        User user = new User("Andres", "Guzman");
        User user2 = new User("Harry", "Doe");
        User user3 = new User("Warm", "Doe");

        return Arrays.asList(user, user2, user3);
    }

}
