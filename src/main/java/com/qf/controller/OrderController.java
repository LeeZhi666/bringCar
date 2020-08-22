package com.qf.controller;

import com.qf.pojo.Order;
import com.qf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/insertOrder")
    @ResponseBody
    public String insertOrder(@RequestParam("getid") String getid, @RequestParam("backid") String backid, @RequestParam("cid") String cid ,@RequestParam("price") String price ,HttpSession httpSession){

        System.out.println(getid+" "+backid+" "+cid+" "+price);
//        System.out.println(request.getURI());
        int cId = Integer.parseInt(cid);
        String uid =(String) httpSession.getAttribute("uid");
        int uId = Integer.parseInt(uid);
        int getId = Integer.parseInt(getid);
        int backId = Integer.parseInt(backid);
        double price1 = Double.parseDouble(price);
        System.out.println(uid);
        Order order = new Order(cId, uId, getId, backId, price1, "已预定");
//        System.out.println(order);
        orderService.insertOrder(order);
        return "success";
    }
}
