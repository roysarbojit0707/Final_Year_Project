package com.Med.med.Controller.Login;

import com.Med.med.DTO.UserDTOForLogin;
import com.Med.med.Service.SellerService;
import com.Med.med.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/SellerLogin")
public class SellerLoginController {
    @Autowired
    private SellerService sellerService;
    @PostMapping("/login")
    public Map<String ,Boolean> registerNewUser(@RequestBody UserDTOForLogin userDTOForLogin){
        String mailId = userDTOForLogin.getMailId();
        String username = userDTOForLogin.getUsername();
        String password = userDTOForLogin.getPassword();
        boolean isRegister = sellerService.SellerLogin(mailId,username,password);
        return Map.of("isRegister",isRegister);
    }
}
