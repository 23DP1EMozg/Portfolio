package com.edvards.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExperienceController {
    @GetMapping("/experience")
    public String Experience(){
     return "experience";
    }
}
