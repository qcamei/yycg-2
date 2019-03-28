package com.cyb.yycg.service.impl;

import com.cyb.yycg.dao.UserDao;
import com.cyb.yycg.entity.User;
import com.cyb.yycg.service.UserService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}

	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}

	@Override
	public int updatePwd(User user) {
		// TODO Auto-generated method stub
		return userDao.updatePwd(user);
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return userDao.delete(id);
	}

	@Override
	public int save(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return userDao.update(user);
	}

	@Override
	public int updateIden(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return userDao.updateIden(map);
	}

	@Override
	public User findpwd(User user) {
		// TODO Auto-generated method stub
		return userDao.findpwd(user);
	}

	@Override
	public List<User> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return userDao.list(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return userDao.getCount(map);
	}
	
}
