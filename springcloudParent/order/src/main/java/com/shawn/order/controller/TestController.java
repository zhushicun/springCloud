package com.shawn.order.controller;

import com.shawn.member.domain.model.User;
import com.shawn.order.fegin.memberClient.MerberFeginClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class TestController {
    @Autowired
    private MerberFeginClient merberFeginClient;

    @GetMapping("/test")
    public String test(){
        User user=merberFeginClient.getmodel("1");
        return user.toString();
    }
}
