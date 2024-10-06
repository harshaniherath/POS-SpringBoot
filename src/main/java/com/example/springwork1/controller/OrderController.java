package com.example.springwork1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springwork1.entity.Order;
import com.example.springwork1.entity.OrderDetails;
import com.example.springwork1.service.ItemService;
import com.example.springwork1.service.PlaceOrderService;

@RestController
public class OrderController {
    
    @Autowired
    private PlaceOrderService placeOrderService;

    @Autowired
    private ItemService itemService;

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orders = placeOrderService.getAllOrders();
        return ResponseEntity.status(200).body(orders);
    }

    @GetMapping("/orderDetails")
    public ResponseEntity<List<OrderDetails>> getAllOrderDetails() {
        List<OrderDetails> orderDetails = placeOrderService.getAllOrderDetails();
        return ResponseEntity.status(200).body(orderDetails);
    }

    @PostMapping("/orders")
    public ResponseEntity<Order> placeOrder(@RequestBody Order order){
        Order placeOrder = new Order();
        placeOrder.setTotalPrice(0.0);

        List<String> itemIds = orderDto.getItemIds();

        itemIds.forEach(itemId -> {
            Item item = itemService.getItemByItemCode(itemCode);

            if(item != null){
                orderedItem.add(item);

                placeOrder.setTotalPrice(placeOrder.getTotalPrice() + item.getUnitPrice());

            }
        });


    }   
}
