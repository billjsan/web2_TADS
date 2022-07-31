package com.ifpe.edu.br.web2.control;

import com.ifpe.edu.br.web2.model.repo.LoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Control {

    @Autowired
    private LoteRepository loteRepository;

    @GetMapping("/")
    public String get(){

        return "get";
    }

    @PostMapping("/")
    public String post(){

        return "post";
    }

    @PutMapping("/")
    public String put(){

        return "put";
    }

    @DeleteMapping("/")
    public String delete(){

        return "delete";
    }
}
