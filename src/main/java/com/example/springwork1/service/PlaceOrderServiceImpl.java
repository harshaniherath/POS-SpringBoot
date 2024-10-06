package com.example.springwork1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springwork1.entity.Order;
import com.example.springwork1.entity.OrderDetails;
import com.example.springwork1.repository.OrderDetailsRepository;
import com.example.springwork1.repository.PlaceOrderRepository;

@Service
public class PlaceOrderServiceImpl implements PlaceOrderService {

    @Autowired
    private PlaceOrderRepository placeOrderRepository;

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    @Override
    public Order placeOrder(Order order) {
        return placeOrderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return placeOrderRepository.findAll();
    }

    @Override
    public List<OrderDetails> getAllOrderDetails() {
        return orderDetailsRepository.findAll();
    }
}
