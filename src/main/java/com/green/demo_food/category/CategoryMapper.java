package com.green.demo_food.category;

import com.green.demo_food.category.model.CategoryEntity;
import com.green.demo_food.category.model.CategoryInsDto;
import com.green.demo_food.category.model.CategoryVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    int insCategory(CategoryEntity entity);
    Long selCategory(CategoryEntity entity);
    List<CategoryVo> voCategory();

}
