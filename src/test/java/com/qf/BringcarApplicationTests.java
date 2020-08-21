package com.qf;

import com.qf.mapper.UserMapper;
import com.qf.pojo.Car;
import com.qf.pojo.City;
import com.qf.pojo.Order;
import com.qf.pojo.User;
import com.qf.service.CarService;
import com.qf.service.CityService;
import com.qf.service.OrderService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.qf.mapper")
class BringcarApplicationTests {
;
    @Autowired
    private OrderService orderService;
	@Test
	void contextLoads() {

		Order order = new Order(1, 2, 3, 4, 5d, "3");
		orderService.insertOrder(order);
	}

}
