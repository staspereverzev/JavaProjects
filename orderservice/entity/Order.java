package com.example.orderservice.entity;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Entity
//@Getter
//@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "ORDER_DETAILS")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "PRODUCT_ID")
    private long productId;

    @Column(name = "QUANTITY")
    private long quantity;

    @Column(name = "ORDER_DATE")
    private Instant orderDate;

    @Column(name = "STATUS")
    private String orderStatus;

    @Column(name = "TOTAL_AMOUNT")
    private long amount;
}
