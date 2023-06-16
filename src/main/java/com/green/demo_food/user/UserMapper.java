package com.green.demo_food.user;

import com.green.demo_food.user.model.UserEntity;
import com.green.demo_food.user.model.UserInsDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserEntity entity);
}
