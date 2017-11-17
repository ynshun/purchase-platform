package com.softisland.basic.business.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.softisland.base.BaseMapper;
import com.softisland.domain.business.BusinessProductDeliver;

/**
 * @desc 用户的产品递送信息表
 * @author zhousg
 * @date 2017年4月24日上午11:26:25
 */
public interface BusinessProductDeliverMapper extends BaseMapper<BusinessProductDeliver> {

	public List<BusinessProductDeliver> getList(
			@Param(value = "user_id") Integer user_id,
			@Param(value = "p_id") Integer p_id);
}
