package ru.dkrupin.project.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {
    @GetMapping("/news.html")
    public String getAllProjects() {
        return "HTML/news";
    }
}
