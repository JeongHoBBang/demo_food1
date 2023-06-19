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
    public Long postMenu(MenuInsDto dto) {
        MenuEntity entity = new MenuEntity();
        entity.setMenu(dto.getMenu());
        entity.setPrice(dto.getPrice());
        entity.setIcategory(dto.getIcategory());
        Long result = mapper.findMenu(entity);
        if (result == null) {
            mapper.insMenu(entity);
            return entity.getImenu();
        } else {
            return result;
        }
    }
    public int MenuCount(MenuUpdDto dto){
        return mapper.chooseMenuCount(dto);
    }
    public List<MenuVo> selMenu(){
        return mapper.selMenu();
    }
}
