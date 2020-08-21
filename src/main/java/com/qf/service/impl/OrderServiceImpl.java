package com.qf.service.impl;

import com.qf.mapper.OrderMapper;
import com.qf.pojo.Order;
import com.qf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public void insertOrder(Order order) {
        orderMapper.insertOrder(order);
    }
}
