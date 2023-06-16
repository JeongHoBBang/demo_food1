package com.green.demo_food.category;

import com.green.demo_food.category.model.CategoryEntity;
import com.green.demo_food.category.model.CategoryInsDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {
    Long insCategory(CategoryEntity entity);
    int selCategory(CategoryEntity entity);

}
