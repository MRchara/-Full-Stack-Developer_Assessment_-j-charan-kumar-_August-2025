package com.example.demo.DTo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailsDTO {
    private Integer orderId;
    private Double valueRs;
    private Integer routeId;
    private LocalTime deliveryTime;
    private String driverName;
    private Integer driverShiftHours;
    private Integer driverPastWeekHours; // Changed from String to Integer
    private Double routeDistanceKm;
    private String routeTrafficLevel;
    private Integer routeBaseTimeMin;
}

