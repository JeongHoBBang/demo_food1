package com.green.demo_food.menu.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MenuVo {
    private Long icategory;
    private Long imenu;
    private String menu;
    private int price;
}
