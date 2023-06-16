package com.green.demo_food.category;

import com.green.demo_food.category.model.CategoryInsDto;
import io.swagger.v3.oas.annotations.Operation;
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
    @Operation(summary = "카테고리 생성")
    public Long postCategory(@RequestBody CategoryInsDto dto){

        return service.postCategory(dto);
    }
}
