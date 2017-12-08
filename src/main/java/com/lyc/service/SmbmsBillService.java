package com.lyc.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lyc.entity.SmbmsBill;

public interface SmbmsBillService {

	List<SmbmsBill> getSmbmsBill(String productName,Integer providerId,Integer isPayment,
			int pageIndex,int pageSize);
	int getBillRow(String productName,Integer providerId,Integer isPayment);
}
