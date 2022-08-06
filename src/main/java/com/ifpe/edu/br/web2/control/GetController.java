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
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
public class GetController {

    @Autowired
    private LoteRepository loteRepository;
    @Autowired
    private DonatarioRepository donatarioRepository;
    @Autowired
    private FiscalizadorRepository fiscalizadorRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    @CrossOrigin("*")
    @GetMapping("/lote")
    public Lote getLote(@RequestParam("id") Long id) {

        Optional<Lote> byId = loteRepository.findById(id);

        Lote lote;

        if (byId.isPresent()) {
            lote = byId.get();
        } else {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return lote;
    }

    @CrossOrigin("*")
    @GetMapping("/lotes")
    public List<Lote> getLotes() {

        return loteRepository.findAll();
    }

    @CrossOrigin("*")
    @GetMapping("/donatario")
    public OrgaoDonatario getOrgaoDonatario(@RequestParam("id") Long id) {

        Optional<OrgaoDonatario> byId = donatarioRepository.findById(id);

        OrgaoDonatario orgaoDonatario;

        if (byId.isPresent()) {
            orgaoDonatario = byId.get();
        } else {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return orgaoDonatario;
    }

    @CrossOrigin("*")
    @GetMapping("/donatarios")
    public List<OrgaoDonatario> getDonatarios() {

        return donatarioRepository.findAll();
    }

    @CrossOrigin("*")
    @GetMapping("/fiscalizador")
    public OrgaoFiscalizador getOrgaoFiscalizador(@RequestParam("id") Long id) {

        Optional<OrgaoFiscalizador> byId = fiscalizadorRepository.findById(id);

        OrgaoFiscalizador orgaoFiscalizador;

        if (byId.isPresent()) {
            orgaoFiscalizador = byId.get();
        } else {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return orgaoFiscalizador;
    }

    @CrossOrigin("*")
    @GetMapping("/fiscalizadores")
    public List<OrgaoFiscalizador> getFiscalizador() {

        return fiscalizadorRepository.findAll();
    }

    @CrossOrigin("*")
    @GetMapping("/produto")
    public Produto getProduto(@RequestParam("id") Long id) {

        Optional<Produto> byId = produtoRepository.findById(id);

        Produto produto;

        if (byId.isPresent()) {
            produto = byId.get();
        } else {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return produto;
    }

    @CrossOrigin("*")
    @GetMapping("/produtos")
    public List<Produto> getProduto() {

        return
                produtoRepository.findAll();
    }
}