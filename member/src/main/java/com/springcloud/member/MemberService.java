package com.springcloud.member;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class MemberService {

    @GetMapping("me-service")
    public String  meService(){
        return "member service!";
    }
}
