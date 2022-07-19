package com.bill.ifpe.control;

import com.bill.ifpe.model.repo.UserRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UserRepoInterface mUserRepo;

    @GetMapping
    private String teste2(){
        new AdminHandler(mUserRepo).setAdminUser();
        return "index";
    }
}