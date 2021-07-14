package ru.kifor4ik.Webserver.Spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kifor4ik.Webserver.DatabasesDAO.ProfileDAO;
import ru.kifor4ik.Webserver.models.Profile;

import javax.servlet.http.Cookie;

@Controller
@RequestMapping("/profile")
public class ProfilesController  {

    private final ProfileDAO profileDAO;

    @Autowired
    public ProfilesController(ProfileDAO profileDAO){
        this.profileDAO = profileDAO;
    }

    @GetMapping("/list")
    public String getAllProfiles(Model model){
        model.addAttribute("profiles", profileDAO.getAllProfiles());
        return "profiles/All_Profiles_Page";
    }

    @GetMapping("/{id}")
    public String getProfileById(@PathVariable("id") String id, Model model){
        Profile profile = profileDAO.getProfileById(id);
        if(profile.getId() == "-1" && profile.getName() == "UNNAMED9999"){
            return "Page_Not_Found";
        }
        model.addAttribute("profile",profile);
        return "profiles/Profile_Page";
    }

    @PostMapping("/login")
    public String loginIn(@RequestParam("login") String login, @RequestParam("password") String password){
        //Cookie cookieProfile = new Cookie("profileActive",profile);
       //cookieProfile.setMaxAge(60 * 60* 24 * 4);
        System.out.println(login + " " + password);
        return "profiles/All_Profiles_Page";
    }
    @GetMapping("/registration")
    public String registrationPage(Model model){
        model.addAttribute("profile", new Profile());
        return "profiles/Create_Profile_Page";
    }

    @PostMapping("/new")
    public String createProfile(@ModelAttribute("profile") Profile profile, @RequestParam("password") String password,
                                @RequestParam("passwordConfirm") String passwordConfirm){
        System.out.println(profile.toString() + " " + password + " " + passwordConfirm);
        return "redirect:/succesful";
    }

}
