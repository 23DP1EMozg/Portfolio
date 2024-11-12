package com.edvards.portfolio.services;

import com.edvards.portfolio.models.Route;
import com.edvards.portfolio.repos.RouteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {

    RouteRepo routeRepo;
    @Autowired
    public RouteService(RouteRepo routeRepo){
        this.routeRepo = routeRepo;
    }

    public void addRoute(Route route){
        routeRepo.save(route);
    }

    public List<Route> getRoutes(){
        return routeRepo.findAll();
    }

    public void removeRoute(Long id){
        routeRepo.deleteById(id);
    }
}
