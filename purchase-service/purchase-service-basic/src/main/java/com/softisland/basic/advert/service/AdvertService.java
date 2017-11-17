/**
 * @package: com.softisland.basic.advert.service
 * @fileName: AdvertService.java
 */
package com.softisland.basic.advert.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softisland.base.BaseMapper;
import com.softisland.base.BaseService;
import com.softisland.basic.advert.mapper.AdvertMapper;
import com.softisland.domain.advert.Advert;

/**
 * @description: 广告管理
 * @createdTime: 2017年11月13日 下午1:27:51
 * @createdUser: ynshun
 * @version: 1.0
 */
@Service
@Transactional
public class AdvertService extends BaseService<Advert> {
	@Resource
	private AdvertMapper advertMapper;

	@Override
	protected BaseMapper<Advert> getMapper() {
		return advertMapper;
	}

}
