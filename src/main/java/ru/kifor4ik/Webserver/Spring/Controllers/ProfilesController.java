package ru.kifor4ik.Webserver.Spring.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profile")
public class ProfilesController  {

    @GetMapping("/")
    public String getProfile(){

        return "profiles/Profile_Page";
    }

}
