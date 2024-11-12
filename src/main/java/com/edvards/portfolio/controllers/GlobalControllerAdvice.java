package com.edvards.portfolio.controllers;

import com.edvards.portfolio.models.Route;
import com.edvards.portfolio.services.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@ControllerAdvice
public class GlobalControllerAdvice {

    private final RouteService routeService;

    @Autowired
    public GlobalControllerAdvice(RouteService routeService) {
        this.routeService = routeService;
    }

    @ModelAttribute("routes")
    public List<Route> populateRoutes() {
        return routeService.getRoutes();
    }
}
