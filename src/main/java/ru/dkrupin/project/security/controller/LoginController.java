package ru.dkrupin.project.security.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.dkrupin.project.security.model.AuthenticationRequest;
import ru.dkrupin.project.security.model.AuthenticationResponse;
import ru.dkrupin.project.security.model.RegisterRequest;
import ru.dkrupin.project.security.service.AuthenticationService;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final AuthenticationService authenticationService;

    //т.к. используем форму на сайте, с которой получаем входные данные для регистрации,
    // то вначале используем запрос GET и в нем делаем редирект на POST
    @GetMapping(path = "/register")
    public String getFeedbackForm(Model model) {
        RegisterRequest request = new RegisterRequest();
        model.addAttribute("request", request);
        return "request";
    }

    @PostMapping(
            path = "/register",
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity<AuthenticationResponse> register(
            //Если проверяем через Postman нужно добавить @RequestBody
            RegisterRequest request) {
        return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }
}