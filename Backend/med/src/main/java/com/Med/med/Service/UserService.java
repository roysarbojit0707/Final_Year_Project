package com.Med.med.Service;

import com.Med.med.Entity.User;
import com.Med.med.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public boolean UserRegister(User user){
        try {
            userRepo.save(user);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public boolean UserLogin(String mail,String username,String password){
        try{
            if(mail.equals("")){
                User user = userRepo.findByUsernameAndPassword(username,password);
                return user != null;
            }else{
                Optional<User> opt = userRepo.findById(mail);
                User user = opt.get();
                if(user!=null){
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
