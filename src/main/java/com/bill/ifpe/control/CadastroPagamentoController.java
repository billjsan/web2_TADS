package com.bill.ifpe.control;

import com.bill.ifpe.model.FormaPagamento;
import com.bill.ifpe.model.repo.FormaPagamentoRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

@Controller
@RequestMapping("/cadastropagamento")
public class CadastroPagamentoController {

    @Autowired
    FormaPagamentoRepoInterface mFormaPagamentoRepo;

    @GetMapping
    public String getAAA(){

        return "cadastropagamento";
    }

    @PostMapping
    public String bbbbbb(@WebParam FormaPagamento pagamento, Model model){

        mFormaPagamentoRepo.save(pagamento);

        return "cadastropagamento";
    }
}
