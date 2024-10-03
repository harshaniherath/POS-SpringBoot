package com.example.springwork1.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Order {
    @Id
    private String orderId;

    @ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.DETACH })
    @JoinColumn(name = "CustomerID", referencedColumnName = "id", nullable = false)
    private Customer custId;

    private LocalDateTime orderDateTime;

    @PrePersist
    protected void onCreate() {
        this.orderDateTime = LocalDateTime.now();
    }

    @OneToMany(mappedBy = "orders", cascade = CascadeType.ALL)
    private List<OrderDetails> orderDetails;

}
