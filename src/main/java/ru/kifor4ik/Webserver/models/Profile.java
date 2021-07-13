package ru.kifor4ik.Webserver.models;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("profile")
public class Profile {

    private int id = -1;
    private String name = "UNNAMED";
    private String Nickname = "UNNICKNAMED";
    private String mail = "NOMAIL";
    private int clicks = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }
}

