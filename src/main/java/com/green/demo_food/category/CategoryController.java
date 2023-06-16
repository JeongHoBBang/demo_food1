package com.green.demo_food.category;

import com.green.demo_food.category.model.CategoryInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("todo/category")
public class CategoryController {
    private final CategoryService service;
    @PostMapping
    public Long postCategory(@RequestBody CategoryInsDto dto){
        return service.postCategory(dto);
    }
}
