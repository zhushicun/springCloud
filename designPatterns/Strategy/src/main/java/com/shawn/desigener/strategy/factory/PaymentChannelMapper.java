package com.shawn.desigener.strategy.factory;

import com.shawn.domain.PaymentChannelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentChannelMapper extends JpaRepository<PaymentChannelEntity,Integer> {
     PaymentChannelEntity findByChannelName(String payCode);
}

