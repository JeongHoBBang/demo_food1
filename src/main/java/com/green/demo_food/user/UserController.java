package com.green.demo_food.user;

import com.green.demo_food.user.model.UserEntity;
import com.green.demo_food.user.model.UserInsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo/user")
public class UserController {
    private final UserService service;
    @Autowired

    public UserController(UserService service) {
        this.service = service;
    }
    @PostMapping
    public Long postUser(@RequestBody UserInsDto dto){
        return service.postUser(dto);
    }


}
