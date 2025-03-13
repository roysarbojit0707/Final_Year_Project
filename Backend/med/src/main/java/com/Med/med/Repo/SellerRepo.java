package com.Med.med.Repo;

import com.Med.med.Entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepo extends JpaRepository<Seller,String > {
    Seller findByUsernameAndPassword(String username,String password);
}
