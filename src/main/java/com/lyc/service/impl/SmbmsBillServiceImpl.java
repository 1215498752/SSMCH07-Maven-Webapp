package com.lyc.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyc.dao.SmbmsBillDao;
import com.lyc.entity.SmbmsBill;
import com.lyc.service.SmbmsBillService;
@Service
public class SmbmsBillServiceImpl implements SmbmsBillService{

	@Autowired
	private SmbmsBillDao dao;

	public List<SmbmsBill> getSmbmsBill(String productName, Integer providerId,
			Integer isPayment, int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return dao.getSmbmsBill(productName, providerId, isPayment, pageIndex, pageSize);
	}

	public int getBillRow(String productName, Integer providerId,
			Integer isPayment) {
		// TODO Auto-generated method stub
		return dao.getBillRow(productName, providerId, isPayment);
	}

	public SmbmsBillDao getDao() {
		return dao;
	}

	public void setDao(SmbmsBillDao dao) {
		this.dao = dao;
	}

}
