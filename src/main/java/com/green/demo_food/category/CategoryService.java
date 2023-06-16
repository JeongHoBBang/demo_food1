package com.green.demo_food.category;

import com.green.demo_food.category.model.CategoryEntity;
import com.green.demo_food.category.model.CategoryInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryMapper mapper;

    public Long postCategory(CategoryInsDto dto){
        CategoryEntity entity = new CategoryEntity();
        entity.setCategory(dto.getCategory());
        int result = mapper.selCategory(entity);
        if (result ==1){
            mapper.selCategory(entity);
        }
        return mapper.insCategory(entity);
    }
}