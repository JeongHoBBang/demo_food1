package com.green.demo_food.payment;

import com.green.demo_food.payment.model.PaymentEntity;
import com.green.demo_food.payment.model.PaymentSelDto;
import com.green.demo_food.payment.model.PaymentSelVo;
import com.green.demo_food.payment.model.PaymentStarDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaymentMapper {
    int insPayment(PaymentEntity entity);
    List<PaymentSelVo> getPayment(PaymentSelDto dto);
    int setStarRating(PaymentStarDto dto);
}
