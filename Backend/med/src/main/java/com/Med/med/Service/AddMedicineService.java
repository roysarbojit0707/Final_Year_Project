package com.Med.med.Service;

import com.Med.med.Entity.Medicine;
import com.Med.med.Repo.MedicineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddMedicineService {
    @Autowired
    private MedicineRepo medicineRepo;
    public boolean addMedicineServiceMethod(String name,String discount, float price, String medicineType, String quantity, String mrp, String description, String uses, String sideEffect, String therapy, String warning,String sellerName){
        Medicine medicine = new Medicine(name,discount,price,medicineType,quantity,mrp,description,uses,sideEffect,therapy,warning,sellerName);
        try {
            medicineRepo.save(medicine);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
