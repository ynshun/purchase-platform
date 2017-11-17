package com.softisland.log.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softisland.base.BaseMapper;
import com.softisland.base.BaseService;
import com.softisland.log.domain.OtherLog;
import com.softisland.log.mapper.OtherLogMapper;

@Service
@Transactional
public class OtherLogService extends BaseService<OtherLog> {
	@Autowired
	private OtherLogMapper otherLogMapper;

	@Override
	protected BaseMapper<OtherLog> getMapper() {
		return otherLogMapper;
	}

}
