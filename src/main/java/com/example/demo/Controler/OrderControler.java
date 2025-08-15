package com.example.demo.Controler;

import com.example.demo.Entity.Order;
import com.example.demo.Service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequestMapping("OrderS")
@RestController
public class OrderControler {

    private final OrderService orderService;

    public OrderControler(OrderService orderService) {
        this.orderService = orderService;
    }


    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Integer id) {
        return orderService.getOrderById(id);
    }

    @GetMapping("/route/{routeId}")
    public List<Order> getOrdersByRouteId(@PathVariable Integer routeId) {
        return orderService.getOrdersByRouteId(routeId);
    }
}
