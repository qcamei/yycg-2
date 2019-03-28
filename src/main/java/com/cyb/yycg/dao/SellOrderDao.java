package com.cyb.yycg.dao;

import com.cyb.yycg.entity.SellOrder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("sellOrderDao")
public interface SellOrderDao {

	/**
	 * ͨ��id������ҩ����
	 * @param id
	 * @return
	 */
	public SellOrder findById(Integer id);
	
	/**
	 * ������ҩ����
	 * @param order
	 * @return
	 */
	public int add(SellOrder order);
	
	/**
	 * ɾ����ҩ����
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * ������ҩ����
	 */
	public int update(SellOrder order);
	
	/**
	 * ��ҳ����δ���˵Ķ���
	 * @param map
	 * @return
	 */
	public List<SellOrder> Nlist(Map<String, Object> map);
	
	/**
	 * ��ҳ�����ѽ��˵Ķ���
	 * @param map
	 * @return
	 */
	public List<SellOrder> Ylist(Map<String, Object> map);
	
	/**
	 * ��ȡ����δ���˶���������
	 * @return
	 */
	public int getNCount(Map<String, Object> map);
	
	/**
	 * ��ȡ�����ѽ��˶���������
	 * @return
	 */
	public int getYCount(Map<String, Object> map);
}
