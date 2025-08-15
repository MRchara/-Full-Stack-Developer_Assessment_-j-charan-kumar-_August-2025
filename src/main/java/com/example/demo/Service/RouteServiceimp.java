package com.example.demo.Service;

import com.example.demo.Entity.Route;
import com.example.demo.Enums.TrafficLevel;
import com.example.demo.Repo.RouteRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteServiceimp implements RouteService {
    private final RouteRepo routeRepository;

    public RouteServiceimp(RouteRepo routeRepository) {
        this.routeRepository = routeRepository;
    }

@Override
    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }
    @Override
    public Route getRouteById(Integer id) {
        return routeRepository.findById(id).orElse(null);
    }
    @Override
    public List<Route> getRoutesByTrafficLevel(TrafficLevel trafficLevel) {
        return routeRepository.findByTrafficLevel(TrafficLevel.valueOf(String.valueOf(trafficLevel)));
    }
}
