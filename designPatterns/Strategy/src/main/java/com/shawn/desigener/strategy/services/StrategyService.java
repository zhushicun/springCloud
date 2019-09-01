package com.shawn.desigener.strategy.services;

import com.shawn.desigener.strategy.factory.PaymentChannelMapper;
import com.shawn.desigener.strategy.myInterface.PayStrategy;
import com.shawn.domain.PaymentChannelEntity;
import com.shawn.util.SpringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StrategyService {

    @Autowired
    private PaymentChannelMapper paymentChannelMapper;

    public PayStrategy getBean(String payCode){
        PaymentChannelEntity paymentChannel = paymentChannelMapper.findByChannelName(payCode);
        if(paymentChannel!=null){
            PayStrategy bean = (PayStrategy)SpringUtils.getBean(paymentChannel.getStrategyBeanId());
            return bean;
        }
        return null;
    }
}
