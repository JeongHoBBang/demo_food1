package com.green.demo_food.management;

import com.green.demo_food.management.model.ManagementEntity;
import com.green.demo_food.management.model.ManagementSelDto;
import com.green.demo_food.management.model.ManagementSelVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManagementMapper {
    int setMonthManagement(ManagementEntity entity);
    ManagementSelVo getMonthManagement(ManagementSelDto dto);
}
