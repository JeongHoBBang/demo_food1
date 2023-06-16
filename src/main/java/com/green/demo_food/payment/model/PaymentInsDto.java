package com.green.demo_food.payment.model;

import lombok.Data;



@Data
public class PaymentInsDto {
    private Long iPayment;
    private Long imanagement;
    private Long imenu;
    private int remainderBalance;
    private int currentMenuPrice;
    private short starRating;
}
