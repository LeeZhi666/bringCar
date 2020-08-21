package com.qf.controller;

import com.qf.pojo.Order;
import com.qf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/insertOrder")
    @ResponseBody
    public String insertOrder(@RequestBody Order order){
        System.out.println(order);
        return "插入成功";
    }
}
