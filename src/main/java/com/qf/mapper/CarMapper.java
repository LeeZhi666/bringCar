package com.qf.mapper;

import com.qf.pojo.Car;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarMapper {
    List<Car> findByOrder(String id);
    List<Car> findByNum(String id);
    Car findCarById(String id);
}
