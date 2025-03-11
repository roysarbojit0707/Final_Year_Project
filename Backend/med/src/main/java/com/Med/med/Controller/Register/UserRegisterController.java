package com.Med.med.Controller.Register;

import com.Med.med.DTO.UserDTOForRegister;
import com.Med.med.Entity.User;
import com.Med.med.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/registerUser")
public class UserRegisterController {
    @Autowired
    private UserService userService;

    @PostMapping("/reg")
    public Map<String, Boolean> registerNewUser(@RequestBody UserDTOForRegister userDTOForRegister) {
        String mailId = userDTOForRegister.getMailId();
        String username = userDTOForRegister.getUsername();
        String password = userDTOForRegister.getPassword();
        String name = userDTOForRegister.getName();
        int age = Integer.parseInt(userDTOForRegister.getAge());
        String phone = userDTOForRegister.getPhone();
        User user = new User(mailId, username, password, name, age, phone);
        boolean isRegister = userService.UserRegister(user);
        return Map.of("isRegister", isRegister);
    }
}
