package com.green.demo_food.management;

import com.green.demo_food.management.model.ManagementInsDto;
import com.green.demo_food.management.model.ManagementSelDto;
import com.green.demo_food.management.model.ManagementSelVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@Tag(name = "관리")
@RequestMapping("/todo/management")
public class ManagementController {
    private final ManagementService service;

    @PostMapping
    @Operation(summary = "이달의 목표설정")
    public int postMonthManagement(@RequestBody ManagementInsDto dto){
        return service.setMonthManagement(dto);
    }
    @GetMapping
    @Operation(summary = "이달의 목표 불러오기")
    public ManagementSelVo getMonthManagement(@RequestParam Long iuser){
        ManagementSelDto dto = new ManagementSelDto();
        dto.setIuser(iuser);
        return service.getMonthManagement(dto);
    }
}
