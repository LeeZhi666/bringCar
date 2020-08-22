package com.qf.controller;

import com.qf.pojo.Car;
import com.qf.service.CarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Api(tags = "车接口")
@Controller

public class CarController {
    @Autowired
    private CarService carService;
    @ApiOperation("按租金排序")
    @RequestMapping("/findByOrder")
    @ResponseBody
    public List<Car> findByOrder(@RequestParam("getid") String getid){

        List<Car> byOrder = carService.findByOrder(getid);
        return byOrder;
    }
    @ApiOperation("按热度排序")
    @RequestMapping("/findByNum")
    @ResponseBody
    public List<Car> findByNum(@RequestParam("getid") String getid){
        List<Car> byNum = carService.findByNum(getid);
        for (Car car : byNum) {
            System.out.println(car);
        }
        return byNum;
    }
    @ApiOperation("通过id查询汽车")
    @RequestMapping("/findCarById")
    @ResponseBody
    public Car findCarById(@RequestParam("cid") String cid){
        System.out.println(cid);
        Car car = carService.findCarById(cid);
        System.out.println(car);
        return car;
    }
}
