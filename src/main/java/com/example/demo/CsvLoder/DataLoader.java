package com.example.demo.CsvLoder;

import com.example.demo.Entity.Driver;
import com.example.demo.Entity.Order;
import com.example.demo.Entity.Route;
import com.example.demo.Enums.TrafficLevel;
import com.example.demo.Repo.DriverRepo;
import com.example.demo.Repo.OrderRepo;
import com.example.demo.Repo.RouteRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalTime;

@Configuration
public class DataLoader {
    @Bean
    CommandLineRunner loadData(DriverRepo driverRepo, OrderRepo orderRepo, RouteRepo routeRepo) {
        return args -> {

            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\chara\\Downloads\\GreenCart_Logistics_Assessment\\Driver.csv"))) {
                String line;
                br.readLine(); // skip header
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    Driver driver = new Driver();
                    driver.setName(data[0]);
                    driver.setShiftHours(Integer.parseInt(data[1]));
                    driver.setPastWeekHours(data[2]);
                    driverRepo.save(driver);
                }
            }



            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\chara\\Downloads\\GreenCart_Logistics_Assessment\\Route.csv"))) {
                String line;
                br.readLine();
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    Route route = new Route();
                    route.setRouteId(Integer.parseInt(data[0]));
                    route.setDistanceKm(Double.parseDouble(data[1]));
                    String trafficValue = data[2].trim().toUpperCase();
                    route.setTrafficLevel(TrafficLevel.valueOf(trafficValue));
                    route.setBaseTimeMin(Integer.parseInt(data[3]));
                    routeRepo.save(route);
                }
            }



            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\chara\\Downloads\\GreenCart_Logistics_Assessment\\Order.csv"))) {
                String line;
                br.readLine(); // skip header
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    Order order = new Order();
                    order.setOrderId(Integer.parseInt(data[0]));
                    order.setValueRs(Double.parseDouble(data[1]));
                    order.setRouteId(Integer.parseInt(data[2]));
                    order.setDeliveryTime(LocalTime.parse(data[3]));
                    orderRepo.save(order);
                }
            }
        };
    }
}
