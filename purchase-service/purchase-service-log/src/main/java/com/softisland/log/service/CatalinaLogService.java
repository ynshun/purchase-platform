package com.softisland.log.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softisland.base.BaseMapper;
import com.softisland.base.BaseService;
import com.softisland.log.domain.CatalinaLog;
import com.softisland.log.mapper.CatalinaLogMapper;

@Service
@Transactional
public class CatalinaLogService extends BaseService<CatalinaLog> {
	@Autowired
	private CatalinaLogMapper catalinaLogMapper;

	@Override
	protected BaseMapper<CatalinaLog> getMapper() {
		return catalinaLogMapper;
	}

}
