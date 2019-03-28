package com.cyb.yycg.dao;

import org.springframework.stereotype.Repository;

@Repository("orderStatusDao")
public interface OrderStatusDao {
	
	/**
	 * ����id�ж϶���״̬
	 * @param id
	 * @return
	 */
	public int findById(Integer id);
}
