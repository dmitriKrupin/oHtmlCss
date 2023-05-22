package ru.dkrupin.project.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String getAllProjects() {
        return "HTML/first-login";
    }
}