package edu.pe.cibertec.appwebsesion3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController {

    @GetMapping("/home")
    public  String home(Model model){

        return "home";
    }

}
