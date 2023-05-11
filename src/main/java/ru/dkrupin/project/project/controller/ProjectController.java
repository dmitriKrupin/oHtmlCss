package ru.dkrupin.project.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {
    @GetMapping("/projects.html")
    public String getAllProjects() {
        return "HTML/projects";
    }
}
