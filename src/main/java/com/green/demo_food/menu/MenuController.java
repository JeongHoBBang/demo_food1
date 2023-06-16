package com.green.demo_food.menu;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping("/todo/menu")
public class MenuController {
    private final MenuService service;

}
