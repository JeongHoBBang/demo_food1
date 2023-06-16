package com.green.demo_food.menu;

import com.green.demo_food.menu.model.MenuInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/todo/menu")
public class MenuController {
    private final MenuService service;
    @PostMapping
    public int postMenu(@RequestBody MenuInsDto dto){
        return service.postMenu(dto);
    }
}
