package com.cyb.yycg.service.impl;

import com.cyb.yycg.dao.MedicineTypeDao;
import com.cyb.yycg.entity.MedicineType;
import com.cyb.yycg.service.MedicineTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("medicineTypeService")
public class MedicineTypeServiceImpl implements MedicineTypeService {

	@Autowired
	private MedicineTypeDao medicineTypeDao;
	
	@Override
	public MedicineType findById(Integer id) {
		// TODO Auto-generated method stub
		return medicineTypeDao.findById(id);
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return medicineTypeDao.delete(id);
	}

	@Override
	public int add(MedicineType medicineType) {
		// TODO Auto-generated method stub
		return medicineTypeDao.add(medicineType);
	}

	@Override
	public List<MedicineType> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return medicineTypeDao.list(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return medicineTypeDao.getCount(map);
	}

	@Override
	public int update(MedicineType medicineType) {
		// TODO Auto-generated method stub
		return medicineTypeDao.update(medicineType);
	}

	@Override
	public List<MedicineType> allList() {
		// TODO Auto-generated method stub
		return medicineTypeDao.allList();
	}

}
