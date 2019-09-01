package com.shawn.desigener.strategy.myImpl;

import com.shawn.desigener.strategy.myInterface.PayStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class WeChatPay implements PayStrategy {
    @Override
    public String toPayHtml() {
        return "weChatPay....";
    }
}
