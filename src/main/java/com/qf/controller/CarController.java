package com.qf.controller;

import com.qf.pojo.Car;
import com.qf.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping("/findByOrder")
    @ResponseBody
    public List<Car> findByOrder(@RequestParam("getid") String getid){

        List<Car> byOrder = carService.findByOrder(getid);
        return byOrder;
    }
    @RequestMapping("/findByNum")
    @ResponseBody
    public List<Car> findByNum(@RequestParam("getid") String getid){
        List<Car> byNum = carService.findByNum(getid);
        for (Car car : byNum) {
            System.out.println(car);
        }
        return byNum;
    }
    @RequestMapping("/findCarById")
    @ResponseBody
    public Car findCarById(@RequestParam("cid") String cid){
        System.out.println(cid);
        Car car = carService.findCarById(cid);
        System.out.println(car);
        return car;
    }
}
