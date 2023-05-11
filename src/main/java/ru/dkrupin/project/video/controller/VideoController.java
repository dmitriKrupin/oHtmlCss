package ru.dkrupin.project.video.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VideoController {
    @GetMapping("/video.html")
    public String getAllProjects() {
        return "HTML/video";
    }
}
