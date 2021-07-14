package ru.kifor4ik.Webserver.Spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kifor4ik.Webserver.DatabasesDAO.ProfileDAO;
import ru.kifor4ik.Webserver.models.Profile;

@Controller
@RequestMapping("/profile")
public class ProfilesController  {

    private final ProfileDAO profileDAO;

    @Autowired
    public ProfilesController(ProfileDAO profileDAO){
        this.profileDAO = profileDAO;
    }

    @GetMapping("")
    public String profileRedirect(){
        return "Main_Page";
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
    @GetMapping("/registration")
    public String createProfile(@ModelAttribute("profile") Profile profile){
        profileDAO.createProfile(profile);
        return "redirect:/";
    }

}
