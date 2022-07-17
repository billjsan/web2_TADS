package com.ifpe.control;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String showHomePage(){
        return "index";
    }

    @RequestMapping("/hello")
    public String showHelloPage(){
        return "hello";
    }

}