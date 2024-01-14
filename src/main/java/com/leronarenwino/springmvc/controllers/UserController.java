package com.leronarenwino.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){

        model.addAttribute("title", "Hello World");
        model.addAttribute("name", "Leron");
        model.addAttribute("lastname", "Arenwino");

        return "details";

    }

}
