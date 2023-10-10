package course2.homework4.hw4.service;

import course2.homework4.hw4.exeptions.WrongLoginException;
import course2.homework4.hw4.exeptions.WrongPasswordException;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public String rightLogin(String login, String password, String confirmPassword){
        if (login.length()>20) {
            throw new WrongLoginException("длина логина больше 20");
        }
        for (int i = 0; i < login.length(); i++) {
            char c = login.charAt(i);
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !(c == '_') && !(c >= '0')) {
                throw new WrongLoginException("в логине неверные символы");
            }
        }

        if (password.length()>20) {
            throw new WrongPasswordException("длина пароля дольше 20");
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !(c == '_') && !(c >= '0')) {
                throw new WrongPasswordException("в парле неверные символы");
            }
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("пароли не совпадают");
        }
        return "login: " + login + ", password: " + password + ", confirmPassword: " + confirmPassword;

    }

}
