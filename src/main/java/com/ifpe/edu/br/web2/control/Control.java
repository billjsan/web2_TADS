package control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {

    @RequestMapping("/")
    public String teste(){

        return "teste";
    }
}
