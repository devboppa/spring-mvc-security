package com.raju.spring_mvc_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String showHome() {
        return "home";
    }

    @GetMapping("/showMyLoginPage")
    public String showLoginPage() {
        return "fancy-login";
    }
}
