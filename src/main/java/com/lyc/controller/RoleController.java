package com.lyc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lyc.service.SmbmsRoleService;
//@Controller
public class RoleController {

	//@Autowired
	private SmbmsRoleService rs;
	/*@RequestMapping("getrolelist")
	public String getSmbmsRoles(Map<String,Object> model){
		model.put("roles", rs.getSmbmsRoles());
		return "jsp/getrolelist";
	}*/
}
