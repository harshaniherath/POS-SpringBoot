package com.example.springwork1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Item {
    @Id

    private String itemCode;

    private String description;

    private Integer qty;

    private Double unitPrice;
}
