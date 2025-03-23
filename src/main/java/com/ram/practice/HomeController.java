package com.ram.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;
    @GetMapping("/home")
    public String homePage(Model model){
        model.addAttribute("message","Hello !! Welcome to spring boot MVC !!!");
        return "index"; // Redirects to index.html (Thymeleaf)
    }

    public String getUser(Model mode){
        mode.addAttribute("user",userService.getUser());
        return "user"; //returns user.html
    }
}
