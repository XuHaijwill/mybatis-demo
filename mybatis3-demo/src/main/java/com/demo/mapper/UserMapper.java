package com.demo.mapper;

import com.demo.entity.User;
import java.util.List;

/***
 * mybatis demo
 * @Slogan 
 */
public interface UserMapper {

    User selectById(Integer id);

    void updateForName(String id,String username);
}
