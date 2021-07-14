package ru.kifor4ik.Webserver.Spring.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

@Controller
public class SpringController {
    @GetMapping("/")
    public String MainPage(Model model){

        return "Main_Page";
    }

    @GetMapping("/notfound")
    public String image(){
        return "Page_Not_Found";
    }
}