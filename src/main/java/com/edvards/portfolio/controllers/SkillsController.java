package com.edvards.portfolio.controllers;

import com.edvards.portfolio.models.Skill;
import com.edvards.portfolio.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/skills")
public class SkillsController {
    private final SkillService skillService;
    @Autowired
    public SkillsController(SkillService skillService){
        this.skillService = skillService;
    }
    @GetMapping
    public String Skills(Model model){
        List<Skill> skills = skillService.getSkills();
        model.addAttribute("skills", skills);
        return "skills";
    }



}
