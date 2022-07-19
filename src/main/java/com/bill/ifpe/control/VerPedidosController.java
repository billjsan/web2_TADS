package com.bill.ifpe.control;

import com.bill.ifpe.IfpeApplication;
import com.bill.ifpe.model.repo.PedidoRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/verpedido")
public class VerPedidosController {

    @Autowired
    private PedidoRepoInterface mPedidoRepo;


    @GetMapping
    public String asjjsgfghgfs(Model model, @RequestParam("val") String msg) {

        model.addAttribute( "pedidos", mPedidoRepo.findAll());
        model.addAttribute("currentuser", IfpeApplication.currentUser);


        if(msg != null && msg.equals("todos")){
            model.addAttribute("info", "todosospedidos");
        }else {
            model.addAttribute("info", "meuspedidos");
        }

        return "verpedidos";
    }
}