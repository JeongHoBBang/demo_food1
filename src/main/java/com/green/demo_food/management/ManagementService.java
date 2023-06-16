package com.green.demo_food.management;

import com.green.demo_food.management.model.ManagementEntity;
import com.green.demo_food.management.model.ManagementInsDto;
import com.green.demo_food.management.model.ManagementSelDto;
import com.green.demo_food.management.model.ManagementSelVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ManagementService {
    private final ManagementMapper mapper;

    public int setMonthManagement(ManagementInsDto dto){
        ManagementEntity entity = new ManagementEntity();
        entity.setMonth(dto.getMonth());
        entity.setIuser(dto.getIuser());
        entity.setYear(dto.getYear());
        entity.setMonthLimit(dto.getMonthLimit());
        return mapper.setMonthManagement(entity);
    }

    public ManagementSelVo getMonthManagement(ManagementSelDto dto){
       return mapper.getMonthManagement(dto);
    }
}
