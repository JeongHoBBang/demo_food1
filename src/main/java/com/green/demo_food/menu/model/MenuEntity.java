package com.green.demo_food.menu.model;

import lombok.Data;

@Data
public class MenuEntity {
    private Long imenu;
    private Long icategory;
    private String menu;
    private int delyn;
    private int price;
    private int numberselections;
}
