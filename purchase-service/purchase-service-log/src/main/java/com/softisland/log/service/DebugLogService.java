package com.softisland.log.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softisland.base.BaseMapper;
import com.softisland.base.BaseService;
import com.softisland.log.domain.DebugLog;
import com.softisland.log.mapper.DebugLogMapper;

@Service
@Transactional
public class DebugLogService extends BaseService<DebugLog> {
	@Autowired
	private DebugLogMapper debugLogMapper;

	@Override
	protected BaseMapper<DebugLog> getMapper() {
		return debugLogMapper;
	}

}
