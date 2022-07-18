package com.bill.ifpe.control;

import com.bill.ifpe.model.User;
import com.bill.ifpe.model.repo.UserRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    private UserRepoInterface mUserRepo;

    @GetMapping
    private String teste(){
        mUserRepo.deleteAll();
        return "cadastro";
    }

    @PostMapping
    private String tes2(){

        User user = new User();
        user.setAdmin(true);
        user.setCpf("09991385453");
        user.setName("Mais um teste");

        mUserRepo.save(user);
        return "deucerto";
    }

}
