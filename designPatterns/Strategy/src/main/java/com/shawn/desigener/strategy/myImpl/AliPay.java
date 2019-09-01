package com.shawn.desigener.strategy.myImpl;

import com.shawn.desigener.strategy.myInterface.PayStrategy;
import org.springframework.stereotype.Component;

@Component
public class AliPay implements PayStrategy {
    @Override
    public String toPayHtml() {
        return "AliPay....";
    }
}
