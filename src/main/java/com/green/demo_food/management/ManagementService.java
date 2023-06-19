package com.green.demo_food.management;

import com.green.demo_food.management.model.ManagementEntity;
import com.green.demo_food.management.model.ManagementInsDto;
import com.green.demo_food.management.model.ManagementSelDto;
import com.green.demo_food.management.model.ManagementSelVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class ManagementService {
    private final ManagementMapper mapper;

    private LocalDate now =LocalDate.now();
    private int month = now.getMonthValue();
    private String  year = String.valueOf(now.getYear()) ;

    public int setMonthManagement(ManagementInsDto dto){
        ManagementEntity entity = new ManagementEntity();
        entity.setMonth(month);
        entity.setIuser(dto.getIuser());
        entity.setYear(year);
        entity.setMonthLimit(dto.getMonthLimit());
        return mapper.setMonthManagement(entity);
    }

    public ManagementSelVo getMonthManagement(ManagementSelDto dto){
        dto.setYear(year);
        dto.setMonth(month);

        return mapper.getMonthManagement(dto);
    }
}
