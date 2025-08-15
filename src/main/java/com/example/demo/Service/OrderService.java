package com.example.demo.Service;

import com.example.demo.Entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();

    Order getOrderById(Integer orderId);

    List<Order> getOrdersByRouteId(Integer routeId);
}
