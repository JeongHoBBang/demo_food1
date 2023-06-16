package com.green.demo_food.user;

import com.green.demo_food.user.model.UserEntity;
import com.green.demo_food.user.model.UserInsDto;
import com.green.demo_food.user.model.UserVo;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int insUser(UserEntity entity);
    Long findUser(UserEntity entity);
    UserVo selUser(UserEntity entity);
    List<UserVo> voUser();
}
