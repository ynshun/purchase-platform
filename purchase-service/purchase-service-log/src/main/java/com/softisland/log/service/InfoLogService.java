package com.softisland.log.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softisland.base.BaseMapper;
import com.softisland.base.BaseService;
import com.softisland.log.domain.InfoLog;
import com.softisland.log.mapper.InfoLogMapper;

@Service
@Transactional
public class InfoLogService extends BaseService<InfoLog> {
	@Autowired
	private InfoLogMapper infoLogMapper;

	@Override
	protected BaseMapper<InfoLog> getMapper() {
		return infoLogMapper;
	}

}
