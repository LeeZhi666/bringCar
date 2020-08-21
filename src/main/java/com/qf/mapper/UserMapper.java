package com.qf.mapper;

import com.qf.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User login(User user);
}
