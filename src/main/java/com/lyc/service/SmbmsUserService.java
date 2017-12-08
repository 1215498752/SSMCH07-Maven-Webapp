package com.lyc.service;

import com.lyc.entity.SmbmsUser;

public interface SmbmsUserService {
	SmbmsUser login(SmbmsUser user);
	int addSmbmsUser(SmbmsUser user);
	int delSmbmsUser(String userCode);
	int updateSmbmsUser(SmbmsUser user);
}
