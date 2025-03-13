package com.Med.med.Service;

import com.Med.med.Entity.Doctor;
import com.Med.med.Repo.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepo doctorRepo;
    public boolean DoctorRegister(Doctor doctor){
        try {
            doctorRepo.save(doctor);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public boolean DoctorLogin(String mail,String username,String password){
        try{
            if(mail.equals("")){
                Doctor doctor = doctorRepo.findByUsernameAndPassword(username,password);
                return doctor != null;
            }else{
                Optional<Doctor> opt = doctorRepo.findById(mail);
                Doctor doctor = opt.get();
                if(doctor !=null){
                    return true;
                }else{
                    return false;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
