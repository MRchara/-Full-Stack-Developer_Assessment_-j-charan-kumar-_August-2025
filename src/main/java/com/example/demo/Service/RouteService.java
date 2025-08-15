package com.example.demo.Service;

import com.example.demo.Entity.Route;
import com.example.demo.Enums.TrafficLevel;

import java.util.List;

public interface RouteService {
    List<Route> getAllRoutes();

    Route getRouteById(Integer  routeId);

    List<Route> getRoutesByTrafficLevel(TrafficLevel level);
}
