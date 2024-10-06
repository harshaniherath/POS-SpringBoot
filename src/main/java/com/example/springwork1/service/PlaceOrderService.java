package com.example.springwork1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springwork1.entity.Order;
import com.example.springwork1.entity.OrderDetails;

@Service
public interface PlaceOrderService {

    Order placeOrder(Order order);

    List<Order> getAllOrders();

    List<OrderDetails> getAllOrderDetails();
}
