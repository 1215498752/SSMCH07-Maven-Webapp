package com.lyc.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lyc.entity.SmbmsProvider;

public interface SmbmsProviderService {

	int addSmbmsProvider(SmbmsProvider provider);
	List<SmbmsProvider> getSmbmsProvider(String proCode,String proName,int pageIndex,int pageSize);
	int getProviderRow(String proCode,String proName);
	int delSmbmsProvider(String proCode);
	SmbmsProvider getSmbmsProviderById(Long id);
	List<SmbmsProvider> getProvider();
}
