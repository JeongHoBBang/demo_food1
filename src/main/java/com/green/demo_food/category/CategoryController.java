package com.green.demo_food.category;

import com.green.demo_food.category.model.CategoryInsDto;
import com.green.demo_food.category.model.CategoryVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("todo/category")
@Tag(name = "카테고리")
public class CategoryController {
    private final CategoryService service;
    @PostMapping
    @Operation(summary = "카테고리 생성")
    public Long postCategory(@RequestBody CategoryInsDto dto){

        return service.postCategory(dto);
    }
    @GetMapping
    @Operation(summary = "전체 카테고리 보기")
    public List<CategoryVo> voCategory(){
        return service.voCategory();
    }
}
