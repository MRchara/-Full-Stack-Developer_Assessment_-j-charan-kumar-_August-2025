package com.example.demo.Service;

import com.example.demo.Entity.Driver;

import java.util.List;

public interface DriverService {
    Driver save(Driver driver);

    List<Driver> getAllDrivers();

    Driver getDriverById(Long id);

    List<Object> getDriversByShiftHours(Integer hours);
}
