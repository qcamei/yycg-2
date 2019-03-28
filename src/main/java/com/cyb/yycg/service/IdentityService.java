package com.cyb.yycg.service;


import com.cyb.yycg.entity.Identity;

import java.util.List;

public interface IdentityService {
	
	/**
	 * ����id���Ҷ�Ӧ��Ȩ��
	 * @param id
	 * @return
	 */
	public Identity findById(int id);
	
	/**
	 * ��������Ȩ����Ϣ
	 * @return
	 */
	public List<Identity> list();
	
	/**
	 * ��������Ȩ�޵��ܼ�¼��
	 * @return
	 */
	public int getCount();
	
}
