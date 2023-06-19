package com.green.demo_food.menu;

import com.green.demo_food.menu.model.MenuEntity;
import com.green.demo_food.menu.model.MenuInsDto;
import com.green.demo_food.menu.model.MenuUpdDto;
import com.green.demo_food.menu.model.MenuVo;
import com.green.demo_food.payment.model.PaymentEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    int insMenu(MenuEntity entity);
    int findPrice(PaymentEntity entity);
    int chooseMenuCount(MenuUpdDto dto);
    List<MenuVo> selMenu();
}
