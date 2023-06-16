package com.green.demo_food.payment.model;

import lombok.Data;

@Data
public class PaymentEntity {
    private Long iPayment;
    private Long imanagement;
    private Long imenu;
    private int remainderBalance;
    private String paymentAt;
    private int currentMenuPrice;
    private short starRating;
}
