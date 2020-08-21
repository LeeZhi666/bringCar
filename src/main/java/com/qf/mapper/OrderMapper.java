package com.qf.mapper;

import com.qf.pojo.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {

    void insertOrder(Order order);
}
