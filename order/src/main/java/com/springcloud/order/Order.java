package com.springcloud.order;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("member")
@Service
public interface Order {

    @RequestMapping("me-service")
    public String getMember2Order();
}
