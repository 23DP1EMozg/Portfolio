package com.edvards.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SkillsController {
    @GetMapping("/skills")

    public String Skills(){
        return "skills";
    }
}
