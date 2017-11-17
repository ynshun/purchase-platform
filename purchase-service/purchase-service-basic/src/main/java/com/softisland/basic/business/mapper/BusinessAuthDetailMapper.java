package com.softisland.basic.business.mapper;

import org.apache.ibatis.annotations.Param;

import com.softisland.base.BaseMapper;
import com.softisland.domain.auth.BusinessAuthDetail;

/**
 * 
 * @description: 用户认证管理
 *
 * @createdTime: 2017年11月13日 下午2:11:32
 * @createdUser: ynshun
 * @version: 1.0
 */
public interface BusinessAuthDetailMapper extends BaseMapper<BusinessAuthDetail> {

	public int checkIsUploadAll(@Param(value = "auth_id") int auth_id, @Param(value = "type") int type);

}
