package com.softisland.basic.business.mapper;

import org.apache.ibatis.annotations.Param;

import com.softisland.base.BaseMapper;
import com.softisland.domain.business.BusinessReference;

/**
 * 
 * @description: 订单来源管理
 *
 * @createdTime: 2017年11月13日 下午2:19:22
 * @createdUser: ynshun
 * @version: 1.0
 */
public interface BusinessReferenceMapper extends BaseMapper<BusinessReference> {

	/**
	 * 根据来源地址匹配后台来源信息的ID
	 * 
	 * @param referenceUrl
	 * @return
	 */
	public BusinessReference getReferenceId(@Param(value = "referenceUrl") String referenceUrl);

}
