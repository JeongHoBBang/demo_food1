package com.green.demo_food.payment;

import com.green.demo_food.management.ManagementMapper;
import com.green.demo_food.payment.model.PaymentEntity;
import com.green.demo_food.payment.model.PaymentInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentMapper mapper;
    private final ManagementMapper managementMapper;

    public int insPayment(PaymentInsDto dto){
        return 0;

    }
}
