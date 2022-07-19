package com.bill.ifpe.control;

import com.bill.ifpe.model.User;
import com.bill.ifpe.model.repo.UserRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@org.springframework.stereotype.Controller
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    private UserRepoInterface mUserRepo;

    @GetMapping
    private String teste(Model model){
        model.addAttribute("user", new User());
        return "cadastro";
    }

    @PostMapping
    private String tes2(@ModelAttribute User user, Model model){

        System.out.println("nome: " + user.getName());
        System.out.println("senha: " + user.getSenha());
        System.out.println("email: " + user.getEmail());
        System.out.println("telefone: " + user.getTelefone());

        Optional<User> byId = mUserRepo.findById(user.getCpf());
        if(!byId.isPresent()){
            mUserRepo.save(user);
        }else {
            model.addAttribute("msg", "Usuário já cadastrado!");
            return "cadastro";
        }

        model.addAttribute("msg", "Usuário cadastrado com sucesso!");
        return "login";
    }

}