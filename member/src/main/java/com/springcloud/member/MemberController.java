package com.springcloud.member;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

     @Value("${server.port}")
     private String port;
    @GetMapping("get-member")
    public String getMember(){
        return "call member! port:"+port;

    }
}
