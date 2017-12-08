package com.lyc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lyc.service.SmbmsBillService;
import com.lyc.service.SmbmsProviderService;
@Controller
public class SmbmsBillController {

	@Autowired
	private SmbmsBillService bs;
	@Autowired
	private SmbmsProviderService ps;
	private int pageSize=5;
	@RequestMapping("bill.do")
	public String getSmbmsBill(String productName,Integer providerId,Integer isPayment,@RequestParam(defaultValue="1") int pageIndex,Map<String,Object> model){
		int totalCount = bs.getBillRow(productName, providerId, isPayment);
		int totalPageCount = totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
		model.put("billList", bs.getSmbmsBill(productName, providerId,isPayment, pageIndex, pageSize));
		model.put("providerList", ps.getProvider());
		model.put("currentPageNo", pageIndex);
		model.put("totalPageCount", totalPageCount);
		model.put("totalCount", totalCount);
		model.put("productName", productName);
		model.put("providerId", providerId);
		model.put("isPayment", isPayment);
		return "jsp/billlist";
		
	}
}
