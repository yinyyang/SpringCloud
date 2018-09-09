package com.springcloud.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {

    @Autowired
    private Order order;

    @Value("${server.port}")
    private String port;

    @GetMapping("get-order")
  public String  getOrder(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("---getOrder--");
        return "call order application of order controller! port:"+port;
  }

    @GetMapping("get-member-2-order")
    public String  getOrder2(){


        return order.getMember2Order();
    }

}
