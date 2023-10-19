package com.example.orderservice.model;

import lombok.*;

//@Getter
//@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest {

    private long productId;

    private long totalAmount;

    private long quantity;

    private PaymentMode paymentMode;
}
