package com.cyb.yycg.dao;

import com.cyb.yycg.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("userDao")
public interface UserDao {
	
	/**
	 * �û���¼
	 * @param user
	 * @return User
	 */
	public User login(User user);
	
	/**
	 * ����id�����û�
	 */
	public User findById(Integer id);

	/**
	 * �޸�����
	 */
	public int updatePwd(User user);
	
	
	/**
	 * ɾ���û�
	 * @return int
	 */
	public int delete(Integer id);
	
	/**
	 * ����û�
	 * @return
	 */
	public int save(User user);
	
	/**
	 * �����û���Ϣ
	 * @param user
	 * @return
	 */
	public int update(User user);
	
	/**
	 * �����û�Ȩ��
	 */
	public int updateIden(Map<String, Object> map);
	
	/**
	 * ������������û�����
	 */
	public User findpwd(User user);
	
	/**
	 * ���������û���Ϣ
	 * @return
	 */
	public List<User> list(Map<String, Object> map);
	
	/**
	 * ��ȡ�����������û���¼��
	 * @param map
	 * @return
	 */
	public int getCount(Map<String, Object> map);
}
