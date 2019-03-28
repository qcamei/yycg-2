package com.cyb.yycg.service.impl;

import com.cyb.yycg.dao.IdentityDao;
import com.cyb.yycg.entity.Identity;
import com.cyb.yycg.service.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("identityService")
public class IdentityServiceImpl implements IdentityService {

	@Autowired
	private IdentityDao identityDao;
	
	@Override
	public List<Identity> list() {
		// TODO Auto-generated method stub
		return identityDao.list();
	}

	@Override
	public Identity findById(int id) {
		// TODO Auto-generated method stub
		return identityDao.findById(id);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return identityDao.getCount();
	}

}
