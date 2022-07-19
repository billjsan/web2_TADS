package com.bill.ifpe.control;

import com.bill.ifpe.model.User;
import com.bill.ifpe.model.repo.UserRepoInterface;

import java.util.List;

public class AdminHandler {

    private final UserRepoInterface mUserRepo;

    public AdminHandler(UserRepoInterface mUserRepo) {
        this.mUserRepo = mUserRepo;
    }

    public void setAdminUser() {

        List<User> byAdm = mUserRepo.findAllByIsAdm("true");

        if(byAdm.isEmpty()){
            User admin = new User();
            admin.setName("admin");
            admin.setCpf("00000000000");
            admin.setEmail("admin@admin");
            admin.setAdm("true");
            admin.setSenha("admin");
            admin.setTelefone("00000000000");

            mUserRepo.save(admin);
        }
    }
}