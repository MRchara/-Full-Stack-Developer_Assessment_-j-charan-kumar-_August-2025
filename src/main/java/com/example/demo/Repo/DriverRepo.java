package com.example.demo.Repo;

import com.example.demo.Entity.Driver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepo extends JpaRepository<Driver, Long> {

    List<Driver> findByShiftHours(Integer shiftHours);
}

