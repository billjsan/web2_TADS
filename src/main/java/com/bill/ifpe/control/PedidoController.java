package com.bill.ifpe.control;

import com.bill.ifpe.IfpeApplication;
import com.bill.ifpe.model.Pedido;
import com.bill.ifpe.model.Prato;
import com.bill.ifpe.model.User;
import com.bill.ifpe.model.repo.FormaPagamentoRepoInterface;
import com.bill.ifpe.model.repo.PedidoRepoInterface;
import com.bill.ifpe.model.repo.PratoRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoRepoInterface mPedidoRepo;
    @Autowired
    private PratoRepoInterface mPratoRepo;
    @Autowired
    private FormaPagamentoRepoInterface mFormaPagamentoRepo;

    @GetMapping()
    private String getPedido(@RequestParam("pratoid") String msg, Model model){

        //confirmar e finalizar pedido
        if(msg != null){
            try {
                Long id = Long.valueOf(msg);
                Optional<Prato> prato = mPratoRepo.findById(id);
                IfpeApplication.pratoAtual = prato.get();
                User currentUser = IfpeApplication.currentUser;

                String info = "modopagamento";

                model.addAttribute("info",info);
                model.addAttribute("pratoselecionado", prato.get());
                model.addAttribute("currenuser", currentUser);
                model.addAttribute("formapagamento",
                        mFormaPagamentoRepo.findAll());
                return "pedido";

            }catch (Exception e){
                System.out.println("erro ao parsear pra long");
            }
        }

        return "pedido";
    }

    //compra confirmada
    @PostMapping
    private String akaka(@ModelAttribute Pedido pedido, Model model){

        pedido.setPrato(IfpeApplication.pratoAtual);
        pedido.setUser(IfpeApplication.currentUser);
        //forma de pagamento veio na variavel pedido
        pedido.setPreco(IfpeApplication.pratoAtual.getPreco());

        mPedidoRepo.save(pedido);

        model.addAttribute("msg", "Pedido Realizado, Obrigado!");
        model.addAttribute("pratos", mPratoRepo.findAll());

        return "main";
    }

}