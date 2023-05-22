package ru.dkrupin.project.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @GetMapping("/index.html")
    public String getAllProjects() {
        return "HTML/index";
    }
}
