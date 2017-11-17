package com.softisland.log.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softisland.base.BaseMapper;
import com.softisland.base.BaseService;
import com.softisland.log.domain.WarnLog;
import com.softisland.log.mapper.WarnLogMapper;

@Service
@Transactional
public class WarnLogService extends BaseService<WarnLog> {
	@Autowired
	private WarnLogMapper warnLogMapper;

	@Override
	protected BaseMapper<WarnLog> getMapper() {
		return warnLogMapper;
	}

}
