package com.green.demo_food.payment.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PaymentSelVo {
    private Long iPayment;
    private String name;
    private String menu;
    private int print;
    private int remainderBalance;
    private String paymentAt;
    private short starRating;
}
