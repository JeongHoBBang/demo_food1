package com.green.demo_food.category;

import com.green.demo_food.category.model.CategoryEntity;
import com.green.demo_food.category.model.CategoryInsDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {
    int insCategory(CategoryEntity entity);
    Long selCategory(CategoryEntity entity);

}
