package com.leronarenwino.springmvc.controllers;

import com.leronarenwino.springmvc.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){

        User user = new User("Leron", "Arenwino");
        user.setEmail("@email.com");

        model.addAttribute("title", "Hello World");
        model.addAttribute("user", user);

        return "details";

    }

    @GetMapping("/list")
    public String list(ModelMap model){
        List<User> userList = new ArrayList<>();

        model.addAttribute("title", "Lista de usuarios");
        model.addAttribute("users", userList);
        return "list";
    }


}
