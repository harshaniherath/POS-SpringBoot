package com.example.springwork1.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDto {

    private String orderId;

    private LocalDateTime orderDateTime;

    private String custId;

    private List<OrderDetailsDto> orderDetails;

}
