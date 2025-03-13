package com.Med.med.Repo;

import com.Med.med.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,String> {
    User findByUsernameAndPassword(String username,String password);
}
