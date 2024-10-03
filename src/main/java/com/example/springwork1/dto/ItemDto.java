package com.example.springwork1.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDto {

    private String code;

    private String description;

    private Integer qty;

    private Double unitPrice;
}
