package com.example.demo.Repo;

import com.example.demo.Entity.Route;
import com.example.demo.Enums.TrafficLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepo extends JpaRepository<Route, Integer> {

    List<Route> findByTrafficLevel(TrafficLevel trafficLevel);
}

