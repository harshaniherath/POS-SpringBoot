package com.example.springwork1.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDetailsDto {
    private String orderId;

    private String itemCode;

    private Integer qty;

    private Double unitPrice;
}
