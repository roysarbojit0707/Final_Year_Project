package com.Med.med.Repo;

import com.Med.med.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
    User findByUsernameAndPassword(String username,String password);
}
