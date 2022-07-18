package com.bill.ifpe.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class HomeController {

    @PostMapping
    private String teste(){
        return "index";
    }
    @GetMapping
    private String teste2(){
        return "index";
    }
}
