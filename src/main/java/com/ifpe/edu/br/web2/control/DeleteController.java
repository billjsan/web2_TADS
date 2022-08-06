package com.ifpe.edu.br.web2.control;

import com.ifpe.edu.br.web2.model.Lote;
import com.ifpe.edu.br.web2.model.OrgaoDonatario;
import com.ifpe.edu.br.web2.model.OrgaoFiscalizador;
import com.ifpe.edu.br.web2.model.Produto;
import com.ifpe.edu.br.web2.model.repo.DonatarioRepository;
import com.ifpe.edu.br.web2.model.repo.FiscalizadorRepository;
import com.ifpe.edu.br.web2.model.repo.LoteRepository;
import com.ifpe.edu.br.web2.model.repo.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.MissingResourceException;
import java.util.Optional;

@RestController
public class DeleteController {

    @Autowired
    private LoteRepository loteRepository;
    @Autowired
    private DonatarioRepository donatarioRepository;
    @Autowired
    private FiscalizadorRepository fiscalizadorRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    @DeleteMapping("/lote")
    public String deleteLote(@RequestParam("id") Long id) {

        try {
            Optional<Lote> byId = loteRepository.findById(id);

            if (!byId.isPresent())
                throw new MissingResourceException("lote not foud", "OrgaoFiscalizador", "");

            loteRepository.delete(byId.get());

        } catch (MissingResourceException e) {
            return e.getMessage();
        } catch (Exception e) {
            return "lote possui referencia para outros objetos, nao é possível excluir";
        }

        return "lote removido com sucesso";
    }

    @DeleteMapping("/produto")
    public String deleteProduto(@RequestParam("id") Long id) {

        try {
            Optional<Produto> byId = produtoRepository.findById(id);

            if (!byId.isPresent())
                throw new MissingResourceException("produto not foud", "OrgaoFiscalizador", "");

            produtoRepository.delete(byId.get());

        } catch (MissingResourceException e) {
            return e.getMessage();
        } catch (Exception e) {
            return "erro";
        }

        return "produto removido com sucesso";
    }

    @DeleteMapping("/donatario")
    public String deleteDonatario(@RequestParam("id") Long id) {

        try {
            Optional<OrgaoDonatario> byId = donatarioRepository.findById(id);

            if (!byId.isPresent())
                throw new MissingResourceException("donatario not foud", "OrgaoFiscalizador", "");

            donatarioRepository.delete(byId.get());

        } catch (MissingResourceException e) {
            return e.getMessage();
        } catch (Exception e) {
            return "erro";
        }

        return "donatario removido com sucesso";
    }

    @DeleteMapping("/fiscalizador")
    public String deleteFiscalizador(@RequestParam("id") Long id) {

        try {
            Optional<OrgaoFiscalizador> byId = fiscalizadorRepository.findById(id);

            if (!byId.isPresent())
                throw new MissingResourceException("fiscalizador not foud", "OrgaoFiscalizador", "");

            fiscalizadorRepository.delete(byId.get());

        } catch (MissingResourceException e) {
            return e.getMessage();
        } catch (Exception e) {
            return "erro";
        }

        return "fiscalizador removido com sucesso";
    }
}