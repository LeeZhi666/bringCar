package com.qf.service.impl;

import com.qf.mapper.CarMapper;
import com.qf.pojo.Car;
import com.qf.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarMapper carMapper;
    @Override
    public List<Car> findByOrder(String id) {
        return carMapper.findByOrder(id);
    }

    @Override
    public List<Car> findByNum(String id) {
        return carMapper.findByNum(id);
    }

    @Override
    public Car findCarById(String id) {
        return carMapper.findCarById(id);
    }
}
