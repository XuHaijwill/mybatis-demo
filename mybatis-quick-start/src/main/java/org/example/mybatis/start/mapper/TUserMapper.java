package org.example.mybatis.start.mapper;

import org.example.mybatis.start.entity.TUser;

public interface TUserMapper {
	
    TUser selectByPrimaryKey(Integer id);
    
}