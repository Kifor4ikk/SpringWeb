package ru.kifor4ik.Webserver.Spring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringController {
    @GetMapping("/")
    public String MainPage(){
        return "Main_Page";
    }
}
