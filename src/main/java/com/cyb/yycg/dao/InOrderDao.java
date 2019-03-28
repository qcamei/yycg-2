package com.cyb.yycg.dao;

import com.cyb.yycg.entity.InOrder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("inOrderDao")
public interface InOrderDao {

	/**
	 * ͨ��id���Ҷ�����Ϣ
	 * @param id
	 * @return
	 */
	public InOrder findById(Integer id);
	
	/**
	 * ��������δ��׼������Ϣ
	 * @return
	 */
	public List<InOrder> Nlist(Map<String, Object> map);
	
	/**
	 * ������������׼�Ķ�����Ϣ(������¼��鿴��)
	 * @return
	 */
	public List<InOrder> Ylist(Map<String, Object> map);
	
	/**
	 * ɾ������
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * ��Ӷ�����Ϣ
	 * @param order
	 * @return
	 */
	public int add(InOrder order);
	
	/**
	 * ���¶�����Ϣ
	 * @param order
	 * @return
	 */
	public int update(InOrder order);
	
	/**
	 * ��ȡ����δ��׼����������
	 * @return
	 */
	public int getNCount(Map<String, Object> map);
	
	/**
	 * ��ȡ��������׼����������
	 * @return
	 */
	public int getYCount(Map<String, Object> map);
}
