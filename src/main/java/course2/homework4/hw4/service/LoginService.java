package course2.homework4.hw4.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public String rightLogin(String login, String password, String confirmPassword){
        return "login: " + login + ", password: " + password + ", confirmPassword: " + confirmPassword;
    }
}
