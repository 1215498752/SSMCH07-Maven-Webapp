package com.lyc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyc.entity.SmbmsRole;
import com.lyc.service.SmbmsRoleService;
//@Service
public class SmbmsRoleServiceImpl implements SmbmsRoleService {
	//@Autowired
	SmbmsRoleService dao;
	/*public List<SmbmsRole> getSmbmsRoles() {
		// TODO Auto-generated method stub
		return null;
	}*/
	public SmbmsRoleService getDao() {
		return dao;
	}
	public void setDao(SmbmsRoleService dao) {
		this.dao = dao;
	}

	
}
