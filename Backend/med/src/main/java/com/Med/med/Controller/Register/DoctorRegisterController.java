package com.Med.med.Controller.Register;

import com.Med.med.DTO.DoctorDTOForRegister;
import com.Med.med.DTO.SellerDTOForRegister;
import com.Med.med.Entity.Doctor;
import com.Med.med.Entity.Seller;
import com.Med.med.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/registerDoctor")
public class DoctorRegisterController {
    @Autowired
    private DoctorService doctorService;

    @PostMapping("/reg")
    public Map<String, Boolean> registerNewUser(@RequestBody DoctorDTOForRegister doctorDTOForRegister) {
        String mailId = doctorDTOForRegister.getMailId();
        String username = doctorDTOForRegister.getUsername();
        String password = doctorDTOForRegister.getPassword();
        String name = doctorDTOForRegister.getName();
        int age = Integer.parseInt(doctorDTOForRegister.getAge());
        String phone = doctorDTOForRegister.getPhone();
        String gender = doctorDTOForRegister.getGender();
        String specialist = doctorDTOForRegister.getSpecialist();
        String chamberLocation = doctorDTOForRegister.getChamberLocation();
        Doctor doctor = new Doctor(mailId, username, password, name,age, phone,gender,specialist,chamberLocation);
        boolean isRegister = doctorService.DoctorRegister(doctor);
        return Map.of("isRegister", isRegister);
    }
}
