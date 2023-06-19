package com.green.demo_food.menu;

import com.green.demo_food.menu.model.*;
import com.green.demo_food.payment.model.PaymentEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    int insMenu(MenuEntity entity);
    int findPrice(PaymentEntity entity);
    int chooseMenuCount(MenuUpdDto dto);
    List<MenuVo> selMenu();
    Long findMenu(MenuEntity entity);
    int updPrice(MenuUpdPriceDto dto);
}
