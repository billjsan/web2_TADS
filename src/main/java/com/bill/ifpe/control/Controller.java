package com.bill.ifpe.control;

import com.bill.ifpe.model.User;
import com.bill.ifpe.model.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Objects;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    private String teste(){

//        User user = new User();
//        user.setName("FUNCIONOU DENOVO");

        List<User> all = userRepository.findAll();

        for (User u: all) {
            userRepository.delete(u);
        }
        return "index";
    }

}
