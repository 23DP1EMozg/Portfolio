package com.edvards.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutMeController {
    @GetMapping("/aboutMe")
    public String AboutMe(){
        return "about_me";
    }
}
