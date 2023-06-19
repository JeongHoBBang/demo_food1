package com.green.demo_food.payment.model;

import lombok.Data;

@Data
public class PaymentGetBalanceDto {
    private Long iuser;
    private String year;
    private int month;
}
