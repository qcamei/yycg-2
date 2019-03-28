package com.cyb.yycg.service;

import com.cyb.yycg.entity.Medicine;

import java.util.List;
import java.util.Map;

public interface MedicineService {

	/**
	 * ����id����ҩƷ��Ϣ
	 * @param id
	 * @return
	 */
	public Medicine findById(Integer id);
	
	/**
	 * ���ݾ���ҩƷ������ҩƷ��Ϣ
	 * @param cName
	 * @return
	 */
	public Medicine findByCName(String cName);
	
	/**
	 * ����ҩƷ������ҩƷ��Ϣ
	 * @param typeId
	 * @return
	 */
	public List<Medicine> findByTypeId(Integer typeId);
	
	/**
	 * ɾ��ҩƷ��Ϣ
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * ����ҩƷ��Ϣ
	 * @param medicine
	 * @return
	 */
	public int update(Medicine medicine);
	
	/**
	 * ���ҩƷ��Ϣ
	 * @param medicine
	 * @return
	 */
	public int add(Medicine medicine);
	
	/**
	 * ����ҩƷ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public int getCount(Map<String, Object> map);
	
	/**
	 * ��������ҩƷ��Ϣ
	 * @param map
	 * @return
	 */
	public List<Medicine> list(Map<String, Object> map);
}
