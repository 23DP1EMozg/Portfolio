package com.edvards.portfolio.controllers;

import com.edvards.portfolio.models.Experience;
import com.edvards.portfolio.services.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ExperienceController {

    private final ExperienceService experienceService;
    @Autowired
    public ExperienceController(ExperienceService experienceService){
        this.experienceService = experienceService;
    }



    @GetMapping("/experience")
    public String Experience(Model model){
        List<Experience> experiences = experienceService.getAllExperiences();
        model.addAttribute("exp", experiences);
        return "experience";
    }
}
