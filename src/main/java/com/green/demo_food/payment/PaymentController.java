package com.green.demo_food.payment;

import com.green.demo_food.payment.model.PaymentIUpdDto;
import com.green.demo_food.payment.model.PaymentInsDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


        //0이 리턴이면 이달 한도 초과

    }
}
