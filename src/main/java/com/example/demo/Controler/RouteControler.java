package com.example.demo.Controler;

import com.example.demo.Entity.Route;
import com.example.demo.Enums.TrafficLevel;
import com.example.demo.Service.RouteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Rout")
public class RouteControler {

    private final RouteService routeService;



    public RouteControler(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping("getdata")
    public List<Route> getAllRoutes() {
        return routeService.getAllRoutes();
    }

    @GetMapping("/{id}")
    public Route getRouteById(@PathVariable Integer id) {
        return routeService.getRouteById(id);
    }

    @GetMapping("/traffic/{level}")
    public List<Route> getRoutesByTrafficLevel(@PathVariable TrafficLevel level) {
        return routeService.getRoutesByTrafficLevel(TrafficLevel.valueOf(String.valueOf(level)));
    }
}
