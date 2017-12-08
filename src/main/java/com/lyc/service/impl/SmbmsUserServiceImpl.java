package com.lyc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lyc.dao.SmbmsUserDao;
import com.lyc.entity.SmbmsUser;
import com.lyc.service.SmbmsUserService;

@Service
public class SmbmsUserServiceImpl implements SmbmsUserService{

	@Autowired
	private SmbmsUserDao dao;
	public SmbmsUser login(SmbmsUser user) {
		return dao.login(user);
	}
	public int addSmbmsUser(SmbmsUser user){
		return dao.addSmbmsUser(user);
	}
	public int delSmbmsUser(String userCode){
		return dao.delSmbmsUser(userCode);
	}
	public int updateSmbmsUser(SmbmsUser user){
		return dao.updateSmbmsUser(user);
	}
	public SmbmsUserDao getDao() {
		return dao;
	}
	public void setDao(SmbmsUserDao dao) {
		this.dao = dao;
	}
	
}
