package com.Med.med.Service;

import com.Med.med.Entity.Seller;
import com.Med.med.Repo.SellerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SellerService {
    @Autowired
    private SellerRepo sellerRepo;
    public boolean SellerRegister(Seller seller){
        try {
            sellerRepo.save(seller);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public boolean SellerLogin(String mail,String username,String password){
        try{
            if(mail.equals("")){
                Seller seller = sellerRepo.findByUsernameAndPassword(username,password);
                return seller != null;
            }else{
                Optional<Seller> opt = sellerRepo.findById(mail);
                Seller seller = opt.get();
                if(seller !=null){
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
