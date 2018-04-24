package com.foxconn.springmybatismvc.dao;

import com.foxconn.springmybatismvc.vo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer number);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer number);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}