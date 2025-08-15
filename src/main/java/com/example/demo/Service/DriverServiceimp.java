package com.example.demo.Service;
import com.example.demo.Entity.Driver;
import com.example.demo.Repo.DriverRepo;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DriverServiceimp implements DriverService {
    private final DriverRepo driverRepository;

    public DriverServiceimp(DriverRepo driverRepository) {
        this.driverRepository = driverRepository;
    }


    @Override
    public Driver save(Driver driver) {
        return driverRepository.save(driver);
    }
    @Override
    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }
    @Override
    public Driver getDriverById(Long id) {
        return driverRepository.findById(id).orElse(null);
    }
    @Override
    public List<Object> getDriversByShiftHours(Integer shiftHours) {
        return Collections.singletonList(driverRepository.findByShiftHours(shiftHours));
    }
}
