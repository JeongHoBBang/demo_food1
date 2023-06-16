package com.green.demo_food.menu;

import com.green.demo_food.menu.model.MenuEntity;
import com.green.demo_food.menu.model.MenuInsDto;
import com.green.demo_food.payment.model.PaymentEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper {
    int insMenu(MenuInsDto dto);
    int findPrice(PaymentEntity entity);
}
