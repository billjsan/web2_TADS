package com.ifpe.edu.br.web2.model.repo;

import com.ifpe.edu.br.web2.model.Lote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class Repository {

    @Autowired
    private LoteRepository mLoteRepo;

    public List<Lote> teste(){

        return mLoteRepo.findAll();
    }
}