package com.edvards.portfolio.controllers;

import com.edvards.portfolio.models.Route;
import com.edvards.portfolio.services.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    private final RouteService routeService;
    @Autowired
    public HomeController(RouteService routeService){
        this.routeService = routeService;
    }
    @GetMapping("/")
    public String home(Model model){
        List<Route> routes = routeService.getRoutes();
        model.addAttribute("routes", routes);
        return "index";
    }

    @GetMapping("/nav")
    public String navigate(
            @RequestParam(name = "path") String path
    ){
        System.out.println("redirecting to: " + path);
        return "redirect:"+path;
    }

}
