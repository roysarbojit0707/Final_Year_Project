package com.Med.med.Controller.Register;

import com.Med.med.DTO.SellerDTOForRegister;
import com.Med.med.DTO.UserDTOForRegister;
import com.Med.med.Entity.Seller;
import com.Med.med.Entity.User;
import com.Med.med.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/registerSeller")
public class SellerRegisterController {
    @Autowired
    private SellerService sellerService;

    @PostMapping("/reg")
    public Map<String, Boolean> registerNewUser(@RequestBody SellerDTOForRegister sellerDTOForRegister) {
        String mailId = sellerDTOForRegister.getMailId();
        String username = sellerDTOForRegister.getUsername();
        String password = sellerDTOForRegister.getPassword();
        String name = sellerDTOForRegister.getName();
        String phone = sellerDTOForRegister.getPhone();
        Seller seller = new Seller(mailId, username, password, name, phone);
        boolean isRegister = sellerService.SellerRegister(seller);
        return Map.of("isRegister", isRegister);
    }
}
