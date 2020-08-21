package com.qf.service;

import com.qf.pojo.Car;

import java.util.List;

public interface CarService {
    List<Car> findByOrder(String id);
    List<Car> findByNum(String id);
    Car findCarById(String id);
}
