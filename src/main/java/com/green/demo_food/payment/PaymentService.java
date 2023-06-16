package com.green.demo_food.payment;

import com.green.demo_food.management.ManagementMapper;
import com.green.demo_food.menu.MenuMapper;
import com.green.demo_food.payment.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentMapper mapper;
    private final MenuMapper menuMapper;
    private final ManagementMapper managementMapper;

    @Transactional(rollbackFor = Exception.class)
    public int insPayment(PaymentInsDto dto)throws Exception{
        PaymentEntity entity = new PaymentEntity();
        entity.setImenu(dto.getImenu());
        entity.setImanagement(dto.getImanagement());

        int price = menuMapper.findPrice(entity);
        int userBalance = managementMapper.getUserBalance(entity);

        int remainderBalance = userBalance - price;
        if (remainderBalance < 0){
            throw new Exception("한도부족");
        }

        entity.setRemainderBalance(remainderBalance);
        entity.setCurrentMenuPrice(price);
        int result = mapper.insPayment(entity);
        if (result==0){
            throw new Exception("등록불가");
        }
        managementMapper.exchangeBalance(entity);
        return result;

    }
    public List<PaymentSelVo> getUserPayment(PaymentSelDto dto){
        return mapper.getPayment(dto);
    }

    public int setStarRating(PaymentStarDto dto){

        return mapper.setStarRating(dto);


    }
}
