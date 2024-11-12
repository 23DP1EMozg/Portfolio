package com.edvards.portfolio.controllers;

import com.edvards.portfolio.models.Route;
import com.edvards.portfolio.services.RouteService;
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

    RouteService routeService;
    @Autowired
    public AdminController(RouteService routeService){
        this.routeService = routeService;
    }
    @GetMapping
    public String admin(Model model){
        List<Route> routes = routeService.getRoutes();
        model.addAttribute("route", new Route());
        model.addAttribute("removedRoute", new Route());
        model.addAttribute("routes", routes);
        return "admin";
    }

    @PostMapping("/submitForm")
    public String createRoute(@ModelAttribute Route route){
        routeService.addRoute(route);
        return "redirect:/admin";
    }

    @PostMapping("/removeRoute")
    public String removeRoute(@ModelAttribute Route route){
        routeService.removeRoute(route.getId());
        return "redirect:/admin";
    }

}
