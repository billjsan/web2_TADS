package com.bill.ifpe.control;

import com.bill.ifpe.model.User;
import com.bill.ifpe.model.repo.PratoRepoInterface;
import com.bill.ifpe.model.repo.UserRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/visualizarusuarios")
public class VisualizarClienteController {

    @Autowired
    private UserRepoInterface mUserRepo;

    @GetMapping
    public String getUsuarios(Model model){

        List<User> users = mUserRepo.findAll();

        model.addAttribute("users", users);

        return "visualizarcliente";
    }

}