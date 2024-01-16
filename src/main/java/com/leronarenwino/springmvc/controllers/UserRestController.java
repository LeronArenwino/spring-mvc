package com.leronarenwino.springmvc.controllers;

import com.leronarenwino.springmvc.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> details(){

        User user = new User("Leron", "Arenwino");

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hello World");
        body.put("user", user);

        return body;

    }

}
