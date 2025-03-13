package com.Med.med.Controller.Login;

import com.Med.med.DTO.DoctorDTOForLogin;
import com.Med.med.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/DoctorLogin")
public class DoctorLoginController {
    @Autowired
    private DoctorService doctorService;
    @PostMapping("/login")
    public Map<String ,Boolean> registerNewUser(@RequestBody DoctorDTOForLogin doctorDTOForLogin){
        String mailId = doctorDTOForLogin.getMailId();
        String username = doctorDTOForLogin.getUsername();
        String password = doctorDTOForLogin.getPassword();
        boolean isRegister = doctorService.DoctorLogin(mailId,username,password);
        return Map.of("isRegister",isRegister);
    }
}
