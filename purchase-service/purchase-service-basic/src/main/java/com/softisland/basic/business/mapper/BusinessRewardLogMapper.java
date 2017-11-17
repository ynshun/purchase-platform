package com.softisland.basic.business.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.softisland.base.BaseMapper;
import com.softisland.domain.business.BusinessRewardLog;

/**
 */
public interface BusinessRewardLogMapper extends BaseMapper<BusinessRewardLog> {

	public List<BusinessRewardLog> queryByUserIdAndOrderIdList(
			@Param(value = "user_id") int user_id,
			@Param(value = "order_id") int order_id);

	public List<BusinessRewardLog> queryByOrderIdGroupBy(
			@Param(value = "user_id") int user_id,
			@Param(value = "reward_status") int reward_status);
}
