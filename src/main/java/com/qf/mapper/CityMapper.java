package com.qf.mapper;

import com.qf.pojo.City;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityMapper {

    List<City> findAll(String pid);
    City getCityById(String id);
}
