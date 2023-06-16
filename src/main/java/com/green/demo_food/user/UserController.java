package com.green.demo_food.user;

import com.green.demo_food.user.model.UserEntity;
import com.green.demo_food.user.model.UserInsDto;
import com.green.demo_food.user.model.UserVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo/user")
@Tag(name = "유저")
public class UserController {
    private final UserService service;
    @Autowired

    public UserController(UserService service) {
        this.service = service;
    }
    @PostMapping
    @Operation(summary = "유저생성")
    public UserVo postUser(@RequestBody UserInsDto dto){
        return service.postUser(dto);
    }
    @GetMapping
    @Operation(summary = "전체 유저 보기")
    public List<UserVo> voUser(){
        return service.voUser();
    }

}
