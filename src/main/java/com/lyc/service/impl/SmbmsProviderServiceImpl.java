package com.lyc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyc.dao.SmbmsProviderDao;
import com.lyc.entity.SmbmsProvider;
import com.lyc.service.SmbmsProviderService;
@Service
public class SmbmsProviderServiceImpl implements SmbmsProviderService {
	@Autowired
	SmbmsProviderDao dao;
	public List<SmbmsProvider> getSmbmsProvider(String proCode, String proName,
			int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return dao.getSmbmsProvider(proCode, proName, (pageIndex-1)*pageSize, pageSize);
	}
	public int getProviderRow(String proCode, String proName) {
		// TODO Auto-generated method stub
		return dao.getProviderRow(proCode, proName);
	}
	public SmbmsProviderDao getDao() {
		return dao;
	}
	public void setDao(SmbmsProviderDao dao) {
		this.dao = dao;
	}
	public int addSmbmsProvider(SmbmsProvider provider) {
		// TODO Auto-generated method stub
		return dao.addSmbmsProvider(provider);
	}
	public int delSmbmsProvider(String proCode) {
		// TODO Auto-generated method stub
		return dao.delSmbmsProvider(proCode);
	}
	public SmbmsProvider getSmbmsProviderById(Long id) {
		// TODO Auto-generated method stub
		return dao.getSmbmsProviderById(id);
	}
	public List<SmbmsProvider> getProvider() {
		// TODO Auto-generated method stub
		return dao.getProvider();
	}
	

}
