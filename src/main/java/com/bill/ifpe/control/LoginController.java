package com.bill.ifpe.control;

import com.bill.ifpe.IfpeApplication;
import com.bill.ifpe.model.Prato;
import com.bill.ifpe.model.User;
import com.bill.ifpe.model.repo.PratoRepoInterface;
import com.bill.ifpe.model.repo.UserRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserRepoInterface mUserRepo;
    @Autowired
    private PratoRepoInterface mPratoRepo;

    @GetMapping
    public String getLoginPage(){
        return "login";
    }

    @PostMapping
    public String login(Model model, @ModelAttribute User loginUser){

        List<User> byEmail = mUserRepo.findAllByEmail(loginUser.getEmail());

        for (User persistUser: byEmail) {
            if(persistUser.getEmail().equals(loginUser.getEmail()) &&
                    persistUser.getSenha().equals(loginUser.getSenha())){

                if(persistUser.isAdm() != null && persistUser.isAdm().equals("true")){
                    model.addAttribute("isAdmin", "true");
                }

                List<Prato> pratos = mPratoRepo.findAll();

                if(pratos.isEmpty()){
                    model.addAttribute("msg", "nenhum prato disponível ainda :(");
                }else {
                    model.addAttribute("pratos", mPratoRepo.findAll());
                }

                IfpeApplication.currentUser = persistUser;
                return "main";
            }
        }

        model.addAttribute("msg", "Usuário não encontrado");
        return "login";
    }
}