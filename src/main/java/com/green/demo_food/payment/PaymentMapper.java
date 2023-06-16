package com.green.demo_food.payment;

import com.green.demo_food.payment.model.PaymentEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper {
    int insPayment(PaymentEntity entity);
}
