package com.foxconn.springmybatismvc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.foxconn.springmybatismvc.dao.UserMapper;
import com.foxconn.springmybatismvc.service.UserService;
import com.foxconn.springmybatismvc.vo.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;
	
	public User getUserByNu(int nu) {
		return userMapper.selectByPrimaryKey(nu);
	}

}
