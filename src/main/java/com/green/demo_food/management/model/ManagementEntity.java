package com.green.demo_food.management.model;

import lombok.Data;

@Data
public class ManagementEntity {
    private Long imanagement;
    private Long iuser;
    private String year;
    private int month;
    private int monthLimit;
    private int balance;
    private int expense;
}
