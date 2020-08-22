package com.qf.controller;

import com.mysql.cj.xdevapi.JsonArray;
import com.qf.pojo.City;
import com.qf.service.CityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
@Api(tags = "城市接口")
@Controller
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;
    @ApiOperation("查询所有城市")
    @RequestMapping("/findAll")
    @ResponseBody
    public List<City> findAll(String pid){
        return cityService.findAll(pid);
    }
    @ApiOperation("通过id查询城市")
    @RequestMapping("/findByIds")
    @ResponseBody
    public List<City> getCityById(@RequestParam("getid") String getid,@RequestParam("backid") String backid){
        System.out.println("yes");
        ArrayList<City> cities = new ArrayList<>();
        cities.add(cityService.getCityById(getid));
        cities.add(cityService.getCityById(backid));
//        for (City city : cities) {
//            System.out.println(city);
//        }
        return cities;
    }
}
