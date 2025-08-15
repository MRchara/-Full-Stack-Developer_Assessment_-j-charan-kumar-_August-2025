package com.example.demo.Controler;

import com.example.demo.Entity.Driver;
import com.example.demo.Service.DriverService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequestMapping("Driver")
@RestController

public class DriverControler {

    private final DriverService driverService;


    public DriverControler(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping("get")
    public List<Driver> getAllDrivers() {
        return driverService.getAllDrivers();
    }

    @GetMapping("/{id}")
    public Driver getDriverById(@PathVariable Long id) {
        return driverService.getDriverById(id);
    }

    @GetMapping("/shift/{hours}")
    public List<Object> getDriversByShiftHours(@PathVariable Integer hours) {
        return driverService.getDriversByShiftHours(hours);
    }

}
