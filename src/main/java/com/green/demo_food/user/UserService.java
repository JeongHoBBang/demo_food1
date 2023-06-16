package com.green.demo_food.user;

import com.green.demo_food.user.model.UserEntity;
import com.green.demo_food.user.model.UserInsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserMapper mapper;
    @Autowired

    public UserService(UserMapper mapper) {
        this.mapper = mapper;
    }
    public Long postUser(UserInsDto dto){
        UserEntity entity = new UserEntity();
        entity.setName(dto.getName());
        mapper.insUser(entity);
        return entity.getIuser();
    }
}
