package com.green.demo_food.menu;

import com.green.demo_food.menu.model.MenuEntity;
import com.green.demo_food.menu.model.MenuInsDto;
import com.green.demo_food.menu.model.MenuUpdDto;
import com.green.demo_food.menu.model.MenuVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuService {
    private final MenuMapper mapper;
    public int postMenu(MenuInsDto dto){
        return mapper.insMenu(dto);
    }
    public int MenuCount(MenuUpdDto dto){
        return mapper.chooseMenuCount(dto);
    }
    public List<MenuVo> selMenu(){
        return mapper.selMenu();
    }
}
