package com.ifpe.edu.br.web2.control;

import org.springframework.web.bind.annotation.*;

@RestController
public class Control {

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
