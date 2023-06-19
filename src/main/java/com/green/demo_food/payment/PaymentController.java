package com.green.demo_food.payment;

import com.green.demo_food.payment.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roulette")
@Tag(name = "지불 기록")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService service;
    @PostMapping
    @Operation(summary = "소비")
    public int postPayment(@RequestBody PaymentInsDto dto){

        try {
           return service.insPayment(dto);
        } catch (Exception e) {
            return 0;
        }

    }

    @GetMapping("/{iuser}")
    @Operation(summary = "유저 소비 불러오기")
    public List<PaymentSelVo> getUserPayment(@PathVariable Long iuser  ){
        PaymentSelDto dto = new PaymentSelDto();
        dto.setIuser(iuser);
        return service.getUserPayment(dto);
    }

    @PatchMapping
    @Operation(summary = "별점등록")
    public int setStarRating(@RequestBody PaymentStarDto dto){
        return service.setStarRating(dto);
    }

}
