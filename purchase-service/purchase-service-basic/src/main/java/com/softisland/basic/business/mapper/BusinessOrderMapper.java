package com.softisland.basic.business.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.softisland.base.BaseMapper;
import com.softisland.domain.business.BusinessOrder;

public interface BusinessOrderMapper extends BaseMapper<BusinessOrder> {

	public List<BusinessOrder> queryAll(BusinessOrder query);

	public BusinessOrder queryContentInfoByPid(@Param(value = "user_id") int user_id, @Param(value = "p_id") int p_id);

	/**
	 * 统计用户的不良记录订单数量
	 * 
	 * @param user_id
	 * @return
	 */
	public int countUnHealthy(@Param(value = "user_id") Integer user_id);

	public String queryPaypalFirstCompleted(@Param(value = "user_id") Integer user_id);

	/**
	 * @desc 获取用户最近一次支付成功使用的支付方式
	 * @author zhousg
	 * @date 2017年4月27日上午10:52:20
	 * @param user_id
	 */
	public Integer queryNearestCompletedPayId(@Param(value = "user_id") Integer user_id);

	/**
	 * 获取用户历史消费金额
	 * 
	 * @Title getHistoryOrderAmount
	 * @Description TODO
	 * @param user_id
	 * @return
	 * @since 2017年5月23日 下午4:29:00
	 */
	public Double getHistoryOrderAmount(@Param(value = "user_id") Integer user_id);
}
