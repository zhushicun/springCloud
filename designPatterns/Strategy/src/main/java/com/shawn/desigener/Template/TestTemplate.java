package com.shawn.desigener.Template;

import com.shawn.desigener.Template.myAbstract.PayTemplate;
import com.shawn.desigener.Template.myTemplate.AliPay;
import com.shawn.desigener.Template.myTemplate.WeChat;

public class TestTemplate {
    public static void main(String[] args) {
        PayTemplate ali=new AliPay();
        String a=ali.callback();
        System.out.println(a);
        PayTemplate wechat= new WeChat();
        String b=wechat.callback();
        System.out.println(b);
    }
}
