package com.bill.ifpe.model.repo;

import com.bill.ifpe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepoInterface extends JpaRepository<User, String> {

    List<User> findAllByEmail(String email);
    List<User> findAllByIsAdm(String isAdm);

}