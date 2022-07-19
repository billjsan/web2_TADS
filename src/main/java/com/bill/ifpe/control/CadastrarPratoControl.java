package com.bill.ifpe.control;

import com.bill.ifpe.model.Prato;
import com.bill.ifpe.model.repo.PratoRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cadastroprato")
public class CadastrarPratoControl {

    @Autowired
    PratoRepoInterface mPratoRepo;

    @GetMapping
    public String getCadastroPrato(Model model){

        return "cadastroprato";
    }

    @PostMapping
    private String getCadastro(Model model, Prato prato){

        System.out.println(prato.getNome());
        System.out.println(prato.getDescricao());
        System.out.println(prato.getPreco());
        System.out.println(prato.getImagem());

        mPratoRepo.save(prato);
        return "cadastroprato";
    }

}