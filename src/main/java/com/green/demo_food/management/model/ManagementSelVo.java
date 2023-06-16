package com.green.demo_food.management.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ManagementSelVo {
    private Long iuser;
    private String name;
    private String year;
    private int month;
    private int monthLimit;
    private int balance;
    private int expense;
}
