package course2.homework4.hw4.controller;

import course2.homework4.hw4.service.LoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService, LoginService loginService1) {
        this.loginService = loginService1;
    }
    @GetMapping()
    public String login (@RequestParam("login") String login, @RequestParam("password") String password, @RequestParam("confirmPassword") String confirmPassword) {
//        return "login: " + login;
        return loginService.rightLogin(login, password, confirmPassword);
    }
}
