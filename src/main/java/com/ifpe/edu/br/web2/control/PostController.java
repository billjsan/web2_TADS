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
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @Autowired
    private LoteRepository loteRepository;
    @Autowired
    private DonatarioRepository donatarioRepository;
    @Autowired
    private FiscalizadorRepository fiscalizadorRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping("/donatario")
    public String addDonatario(@RequestBody OrgaoDonatario orgaoDonatario) {

        try {

            donatarioRepository.save(orgaoDonatario);

            return "Órgão donatário cadastrado com sucesso!";

        } catch (Exception e) {
            return "não foi possível cadastrar o Órgão donatário";
        }
    }

    @PostMapping("/fiscalizador")
    public String addfiscalizador(@RequestBody OrgaoFiscalizador orgaoFiscalizador) {

        try {

            fiscalizadorRepository.save(orgaoFiscalizador);

            return "Órgão fiscalizador cadastrado com sucesso!";

        } catch (Exception e) {
            return "não foi possível cadastrar o Órgão fiscalizador";
        }
    }

    @PostMapping("/produto")
    public String addProduto(@RequestBody Produto produto) {

        try {

            produtoRepository.save(produto);

            return "Produto cadastrado com sucesso!";

        } catch (Exception e) {
            return "não foi possível cadastrar o produto";
        }
    }

    @PostMapping("/lote")
    public String addLote(@RequestBody Lote lote) {

        try {

            loteRepository.save(lote);

            return "Lote cadastrado com sucesso!";

        } catch (Exception e) {
            return "não foi possível cadastrar o lote";
        }
    }

    @PutMapping("/")
    public String put() {

        return "put";
    }

    @DeleteMapping("/")
    public String delete() {

        return "delete";
    }
}