package com.softisland.log.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softisland.base.BaseMapper;
import com.softisland.base.BaseService;
import com.softisland.log.domain.ErrorLog;
import com.softisland.log.mapper.ErrorLogMapper;

@Service
@Transactional
public class ErrorLogService extends BaseService<ErrorLog> {
	@Autowired
	private ErrorLogMapper errorLogMapper;

	@Override
	protected BaseMapper<ErrorLog> getMapper() {
		return errorLogMapper;
	}

}
