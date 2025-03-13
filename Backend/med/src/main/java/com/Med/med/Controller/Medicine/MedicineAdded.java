package com.Med.med.Controller.Medicine;

import com.Med.med.DTO.MedicineDTOForAddMedicine;
import com.Med.med.Service.AddMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/addMedicine")
public class MedicineAdded {
    @Autowired
    private AddMedicineService medicineService;
    @PostMapping
    public Map<String,Boolean> AddMedicine(@RequestBody MedicineDTOForAddMedicine medicineDTOForAddMedicine){
        String name = medicineDTOForAddMedicine.getName();
        String discount = medicineDTOForAddMedicine.getDiscount();
        String medicineType = medicineDTOForAddMedicine.getMedicineType();
        String quantity = medicineDTOForAddMedicine.getQuantity();
        String mrp = medicineDTOForAddMedicine.getMrp();
        float mrpValue = Float.parseFloat(mrp);
        float discountValue = Float.parseFloat(discount);
        float price = mrpValue - ((mrpValue*discountValue)/100);
        String description = medicineDTOForAddMedicine.getDescription();
        String uses = medicineDTOForAddMedicine.getUses();
        String sideEffect = medicineDTOForAddMedicine.getSideEffect();
        String therapy = medicineDTOForAddMedicine.getTherapy();
        String warning = medicineDTOForAddMedicine.getWarning();
        String sellerUsername = medicineDTOForAddMedicine.getSellerUsername();
        boolean isAdded = medicineService.addMedicineServiceMethod(name,discount,price,medicineType,quantity,mrp,description,uses,sideEffect,therapy,warning, sellerUsername);
        return Map.of("isAdded",isAdded);
    }
}
