package com.lyc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lyc.entity.SmbmsBill;


public interface SmbmsBillDao {

	List<SmbmsBill> getSmbmsBill(@Param("productName") String productName,@Param("providerId") Integer providerId,@Param("isPayment") Integer isPayment,
			@Param("begin") int begin,@Param("size") int size);
	int getBillRow(@Param("productName") String productName,@Param("providerId") Integer providerId,@Param("isPayment") Integer isPayment);
}
