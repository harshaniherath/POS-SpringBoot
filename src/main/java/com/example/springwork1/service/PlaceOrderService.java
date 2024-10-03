package com.example.springwork1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springwork1.dto.OrderDetailsDto;
import com.example.springwork1.dto.OrderDto;
import com.example.springwork1.entity.Order;

@Service
public interface PlaceOrderService {

    Order placeOrder(OrderDto dto);

    List<OrderDto> LoadOrders();

    List<OrderDetailsDto> LoadOrderDeatils();
}
