package ru.dkrupin.project.zakupki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ZakupkiController {
    @GetMapping("/zakupki.html")
    public String getAllProjects() {
        return "HTML/zakupki";
    }
}
