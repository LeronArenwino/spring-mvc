package com.leronarenwino.springmvc.controllers;

import com.leronarenwino.springmvc.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){

        User user = new User("Leron", "Arenwino");

        model.addAttribute("title", "Hello World");
        model.addAttribute("user", user);

        return "details";

    }

}
