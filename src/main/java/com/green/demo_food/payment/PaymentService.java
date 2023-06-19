package com.green.demo_food.payment;

import com.green.demo_food.management.ManagementMapper;
import com.green.demo_food.management.model.ManagementBalanceVo;
import com.green.demo_food.management.model.ManagementSelDto;
import com.green.demo_food.management.model.ManagementSelVo;
import com.green.demo_food.menu.MenuMapper;
import com.green.demo_food.payment.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.desktop.AppReopenedEvent;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentMapper mapper;
    private final MenuMapper menuMapper;
    private final ManagementMapper managementMapper;
    private LocalDate now=LocalDate.now();
    private String year= String.valueOf(now.getYear());
    private int month=now.getMonthValue();

    @Transactional(rollbackFor = Exception.class)
    public int insPayment(PaymentInsDto dto)throws Exception{
        PaymentEntity entity = new PaymentEntity();
        entity.setImenu(dto.getImenu());
        PaymentGetBalanceDto paymentGetBalanceDto = new PaymentGetBalanceDto();
        paymentGetBalanceDto.setIuser(dto.getIuser());
        paymentGetBalanceDto.setYear(year);
        paymentGetBalanceDto.setMonth(month);

        int price = menuMapper.findPrice(entity);
        ManagementBalanceVo userBalance = managementMapper.getUserBalance(paymentGetBalanceDto);

        int remainderBalance = userBalance.getBalance() - price;
        if (remainderBalance < 0){
            throw new Exception("한도부족");
        }
        entity.setImanagement(userBalance.getImanagement());
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
