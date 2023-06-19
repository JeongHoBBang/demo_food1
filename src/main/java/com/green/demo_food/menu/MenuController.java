package com.green.demo_food.menu;

import com.green.demo_food.menu.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/todo/menu")
@Tag(name = "메뉴")
public class MenuController {
    private final MenuService service;
    @PostMapping
    @Operation(summary = "메뉴생성")
    public Long postMenu(@RequestBody MenuInsDto dto){
        return service.postMenu(dto);
    }
    @PatchMapping
    @Operation(summary = "선택카운트")
    public int MenuCount(@RequestBody MenuUpdDto dto){
        return service.MenuCount(dto);
    }
    @GetMapping
    @Operation(summary = "메뉴")
    public List<MenuVo> selMenu(){
        return service.selMenu();
    }
    @PatchMapping("/{imenu}")
    @Operation(summary = "가격수정")
    public int updPrice(@PathVariable Long imenu, int price){
        MenuUpdPriceDto dto = new MenuUpdPriceDto();
        dto.setImenu(imenu);
        dto.setPrice(price);
        return service.updPrice(dto);
    }
}
