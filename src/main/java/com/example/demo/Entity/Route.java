package com.example.demo.Entity;


import com.example.demo.Enums.TrafficLevel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Route {
    @Id
    private Integer routeId;

    private Double distanceKm;
    @Enumerated(EnumType.STRING)
    private TrafficLevel trafficLevel;
    private Integer baseTimeMin;
    @ManyToOne
    private Driver driver;
}

