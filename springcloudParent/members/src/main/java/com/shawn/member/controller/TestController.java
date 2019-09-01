package com.shawn.member.controller;


import com.shawn.member.domain.model.User;
import com.shawn.member.memberApi.TestApi;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class TestController implements TestApi {

    @Override
    @PreAuthorize("hasAuthority('test')")
    @GetMapping("/getUser/{id}")
    public User getmodel(@PathVariable("id") String id) {
        User user = new User();
        user.setId(id);
        user.setName("shawn") ;
        user.setPhone("15955480722");
        return user;
    }

}
