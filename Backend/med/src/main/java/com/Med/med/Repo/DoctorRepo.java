package com.Med.med.Repo;

import com.Med.med.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor,String > {
    Doctor findByUsernameAndPassword(String username,String password);
}
