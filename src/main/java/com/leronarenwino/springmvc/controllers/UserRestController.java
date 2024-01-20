package com.leronarenwino.springmvc.controllers;

import com.leronarenwino.springmvc.models.User;
import com.leronarenwino.springmvc.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
