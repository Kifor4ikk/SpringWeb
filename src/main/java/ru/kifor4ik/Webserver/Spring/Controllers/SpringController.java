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
    public String MainPage(@RequestParam(value = "name",required = false) String name, Model model){
        model.addAttribute("name",name);
        return "Main_Page";
    }

    @GetMapping("/pagenotfound")
    public String PageNotFound() {
        return "Page_Not_Found";
    }
    @GetMapping("/notfound")
    public String image(){
        return "Page_Not_Found";
    }
}