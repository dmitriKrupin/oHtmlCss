package ru.dkrupin.project.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("HTML/index");
        //registry.addViewController("/login").setViewName("HTML/layout/login");
        //registry.addViewController("/").setViewName("HTML/first-login");
        //registry.addViewController("/first-login").setViewName("HTML/first-login");
    }

}