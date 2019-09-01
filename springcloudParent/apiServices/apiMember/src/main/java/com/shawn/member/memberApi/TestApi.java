package com.shawn.member.memberApi;

import com.shawn.member.domain.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


public interface TestApi {
    @GetMapping("/member/getUser/{id}")
    public User getmodel(@PathVariable("id") String id);
}
