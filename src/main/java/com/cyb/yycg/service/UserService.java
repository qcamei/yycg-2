package com.cyb.yycg.service;


import com.cyb.yycg.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
	
	/**
	 * ??????
	 * @param user
	 * @return User
	 */
	public User login(User user);
	
	/**
	 * ????id???????
	 */
	public User findById(Integer id);

	/**
	 * ???????
	 */
	public int updatePwd(User user);
	
	
	/**
	 * ??????
	 * @return int
	 */
	public int delete(Integer id);
	
	/**
	 * ??????
	 * @return
	 */
	public int save(User user);
	
	/**
	 * ??????????
	 * @param user
	 * @return
	 */
	public int update(User user);
	
	/**
	 * ??????????
	 */
	public int updateIden(Map<String, Object> map);
	
	/**
	 * ??????????????????
	 */
	public User findpwd(User user);
	
	/**
	 * ??????????????
	 * @return
	 */
	public List<User> list(Map<String, Object> map);
	
	/**
	 * ?????????????????????
	 * @param map
	 * @return
	 */
	public int getCount(Map<String, Object> map);
}