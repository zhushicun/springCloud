package com.shawn.controller;

import com.shawn.desigener.strategy.myInterface.PayStrategy;
import com.shawn.desigener.strategy.services.StrategyService;
import com.shawn.services.TestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestServices testServices;
    @Autowired
    private StrategyService strategyService;

    @RequestMapping("/test")
    public String jpaTest(){
        return testServices.findTest(1).toString();
    }

    @RequestMapping("/test1")
    public String mybatis(){
        return testServices.findTestMybatis(2).toString();
    }

    @RequestMapping("/test2")
    public String update(){
         testServices.updateTest("xiaoming");
         return testServices.findTest(1).toString();
    }

    @GetMapping("/test3")
    public String update(String paycode){
        PayStrategy pay = strategyService.getBean(paycode);
        if(pay!=null){
            return pay.toPayHtml();
        }
        return "fail test";
    }

}
