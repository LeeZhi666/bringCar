package com.qf.service;

import com.qf.pojo.City;

import java.util.List;

public interface CityService {

    List<City> findAll(String pid);
    City getCityById(String id);
}
