package com.edvards.portfolio.controllers;

import com.edvards.portfolio.models.Experience;
import com.edvards.portfolio.models.Route;
import com.edvards.portfolio.models.Skill;
import com.edvards.portfolio.services.ExperienceService;
import com.edvards.portfolio.services.RouteService;
import com.edvards.portfolio.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final RouteService routeService;
    private final SkillService skillService;
    private final ExperienceService experienceService;
    @Autowired
    public AdminController(RouteService routeService, SkillService skillService, ExperienceService experienceService){
        this.routeService = routeService;
        this.skillService = skillService;
        this.experienceService = experienceService;
    }
    @GetMapping
    public String admin(Model model){
        List<Route> routes = routeService.getRoutes();
        List<Skill> skills = skillService.getSkills();
        List<Experience> experiences = experienceService.getAllExperiences();

        model.addAttribute("route", new Route());
        model.addAttribute("removedRoute", new Route());
        model.addAttribute("routes", routes);

        model.addAttribute("skills", skills);
        model.addAttribute("skill", new Skill());
        model.addAttribute("removedSkill", new Skill());

        model.addAttribute("experiences", experiences);
        model.addAttribute("exp", new Experience());
        model.addAttribute("removedExp", new Experience());
        return "admin";
    }

    @PostMapping("/createRoute")
    public String createRoute(@ModelAttribute Route route){
        routeService.addRoute(route);
        return "redirect:/admin";
    }

    @PostMapping("/removeRoute")
    public String removeRoute(@ModelAttribute Route route){
        routeService.removeRoute(route.getId());
        return "redirect:/admin";
    }

    @PostMapping("/createSkill")
    public String addSkill(@ModelAttribute Skill skill){
        skillService.addSkill(skill);
        return "redirect:/admin";
    }

    @PostMapping("/removeSkill")
    public String removeSkill(@ModelAttribute Skill skill){
        skillService.removeSkill(skill.getId());
        return "redirect:/admin";
    }

    @PostMapping("/addExperience")
    public String addExperience(@ModelAttribute Experience experience){
        experienceService.addExperience(experience);
        return "redirect:/admin";
    }

    @PostMapping("/removeExperience")
    public String removeExperience(@ModelAttribute Experience experience){
        experienceService.removeExperience(experience.getId());
        return "redirect:/admin";
    }

}
