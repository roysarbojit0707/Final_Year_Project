package com.Med.med.Controller.Login;

import com.Med.med.DTO.UserDTOForLogin;
import com.Med.med.DTO.UserDTOForRegister;
import com.Med.med.Entity.User;
import com.Med.med.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/loginUser")
public class UserLoginController {
    @Autowired
    private UserService userService;
    @PostMapping("/login")
    public Map<String ,Boolean> registerNewUser(@RequestBody UserDTOForLogin userDTOForLogin){
        String mailId = userDTOForLogin.getMailId();
        String username = userDTOForLogin.getUsername();
        String password = userDTOForLogin.getPassword();
        boolean isRegister = userService.UserLogin(mailId,username,password);
        return Map.of("isRegister",isRegister);
    }
}
