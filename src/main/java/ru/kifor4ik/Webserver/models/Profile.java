package ru.kifor4ik.Webserver.models;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

public class Profile {

    private String id = "-1";
    private String name = "UNNAMED9999";
    private String nickname = "UNNICKNAMED";
    private String mail = "NOMAIL";
    private String phoneNumber = "000000000000";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    public String toString(){
        return this.id + " " + this.name + " " + this.nickname + " " + this.mail + " " + this.phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

