package com.example.demo.Service;

import com.example.demo.Entity.Order;
import com.example.demo.Repo.OrderRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceimp implements OrderService {
    private final OrderRepo orderRepository;

    public OrderServiceimp(OrderRepo orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
    @Override
    public Order getOrderById(Integer id) {
        return orderRepository.findById(id).orElse(null);
    }
    @Override
    public List<Order> getOrdersByRouteId(Integer routeId) {
        return orderRepository.findByRouteId(routeId);
    }
}
