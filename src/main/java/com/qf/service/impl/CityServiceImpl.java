package com.qf.service.impl;

import com.qf.mapper.CityMapper;
import com.qf.pojo.City;
import com.qf.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;
    @Override
    public List<City> findAll(String pid) {
        return cityMapper.findAll(pid);
    }

    @Override
    public City getCityById(String id) {
        return cityMapper.getCityById(id);
    }
}
