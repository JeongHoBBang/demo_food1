package com.green.demo_food.menu;

import com.green.demo_food.menu.model.MenuInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuService {
    private final MenuMapper mapper;
    public int postMenu(MenuInsDto dto){
        return mapper.insMenu(dto);
    }
}
