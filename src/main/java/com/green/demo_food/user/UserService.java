package com.green.demo_food.user;

import com.green.demo_food.user.model.UserEntity;
import com.green.demo_food.user.model.UserInsDto;
import com.green.demo_food.user.model.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserMapper mapper;
    @Autowired

    public UserService(UserMapper mapper) {
        this.mapper = mapper;
    }

    public UserVo postUser(UserInsDto dto) {
        UserEntity entity = new UserEntity();
        entity.setName(dto.getName());
        Long find = mapper.findUser(entity);
        if (find == null) {
            mapper.insUser(entity);

        } else {
            entity.setIuser(find);
        }
        return mapper.selUser(entity);

    }
}
