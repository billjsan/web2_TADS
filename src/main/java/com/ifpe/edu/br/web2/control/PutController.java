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
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
public class PutController {

    @Autowired
    private LoteRepository loteRepository;
    @Autowired
    private DonatarioRepository donatarioRepository;
    @Autowired
    private FiscalizadorRepository fiscalizadorRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    @PutMapping("/lote")
    public String updateLote(@RequestBody Lote lote) {

        try {

            Optional<Lote> byId = loteRepository.findById(lote.getId());

            if (!byId.isPresent()) throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);

            loteRepository.save(lote);

            return "Lote atualizado com sucesso!";

        } catch (Exception e) {
            return "não foi possível atualizar o lote";
        }
    }

    @PutMapping("/donatario")
    public String updateDonatario(@RequestBody OrgaoDonatario donatario) {

        try {

            Optional<OrgaoDonatario> byId = donatarioRepository.findById(donatario.getId());

            if (!byId.isPresent()) throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);

            donatarioRepository.save(donatario);

            return "Donatário atualizado com sucesso!";

        } catch (Exception e) {
            return "não foi possível atualizar o donatário";
        }
    }

    @PutMapping("/fiscalizador")
    public String updateFiscalizador(@RequestBody OrgaoFiscalizador fiscalizador) {

        try {

            Optional<OrgaoFiscalizador> byId = fiscalizadorRepository.findById(fiscalizador.getId());

            if (!byId.isPresent()) throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);

            fiscalizadorRepository.save(fiscalizador);

            return "Fiscalizador atualizado com sucesso!";

        } catch (Exception e) {
            return "não foi possível atualizar o fiscalizador";
        }
    }

    @PutMapping("/produto")
    public String updateFiscalizador(@RequestBody Produto produto) {

        try {

            Optional<Produto> byId = produtoRepository.findById(produto.getId());

            if (!byId.isPresent()) throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);

            produtoRepository.save(produto);

            return "Produto atualizado com sucesso!";

        } catch (Exception e) {
            return "não foi possível atualizar o produto";
        }
    }
}
