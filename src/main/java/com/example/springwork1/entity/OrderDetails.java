package com.example.springwork1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderDetails {
    @Id
    private String orderId;

    @Id
    private String itemCode;

    private Integer qty;

    private Double unitPrice;

    @ManyToOne
    @JoinColumn(name = "order Id", referencedColumnName = "orderId", insertable = false, updatable = false)
    private Order orders;

}
