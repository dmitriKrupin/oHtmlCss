package pro.k12.project.security.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pro.k12.project.security.model.AuthenticationRequest;
import pro.k12.project.security.model.AuthenticationResponse;
import pro.k12.project.security.model.RegisterRequest;
import pro.k12.project.security.service.AuthenticationService;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final AuthenticationService authenticationService;

    //т.к. используем форму на сайте, с которой получаем входные данные для регистрации,
    // то вначале используем запрос GET и в нем делаем редирект на POST
    /*@GetMapping(path = "/register")
    public String getRegisterForm(Model model) {
        RegisterRequest request = new RegisterRequest();
        model.addAttribute("request", request);
        return "request";
    }*/

    @PostMapping(path = "/register")
    //если будешь использовать форму разкомментируй
    // consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public ResponseEntity<AuthenticationResponse> register(
            //Если проверяем через Postman нужно добавить @RequestBod и yдалить consumes
            @RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authenticationService.register(request));
    }

    /*@GetMapping(value = "/set-cookie")
    public ResponseEntity<?> setCookie(HttpServletResponse response) throws IOException {
        Cookie cookie = new Cookie("data", "Come_to_the_dark_side");//создаем объект Cookie,
        //в конструкторе указываем значения для name и value

        cookie.setPath("/");//устанавливаем путь
        cookie.setMaxAge(86400);//здесь устанавливается время жизни куки
        response.addCookie(cookie);//добавляем Cookie в запрос
        response.setContentType("text/plain");//устанавливаем контекст
        return ResponseEntity.ok().body(HttpStatus.OK);//получилось как бы два раза статус ответа установили, выбирайте какой вариант лучше
    }*/

    /*@GetMapping("/authenticate")
    public String getAuthenticateForm(Model model) {
        AuthenticationRequest request = new AuthenticationRequest();
        model.addAttribute("authenticate", request);
        return "authenticate";
    }*/

    @PostMapping(
            path = "/authenticate"/*,
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE}*/)
    public ResponseEntity<AuthenticationResponse> authenticate(
            //Если проверяем через Postman нужно добавить @RequestBod и yдалить consumes
            @RequestBody AuthenticationRequest request) {
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }
}