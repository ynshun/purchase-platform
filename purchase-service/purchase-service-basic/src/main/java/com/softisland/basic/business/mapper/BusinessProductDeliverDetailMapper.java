package com.softisland.basic.business.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.softisland.base.BaseMapper;
import com.softisland.domain.business.BusinessProductDeliverDetail;

/**
 * @desc 用户的产品递送信息表 - 详情
 * @author zhousg
 * @date 2017年4月24日上午11:26:25
 */
public interface BusinessProductDeliverDetailMapper extends BaseMapper<BusinessProductDeliverDetail> {

	public List<BusinessProductDeliverDetail> queryDetail(@Param(value = "product_deliver_id") Integer product_deliver_id);
}
