package com.softisland.basic.business.mapper;

import org.apache.ibatis.annotations.Param;

import com.softisland.base.BaseMapper;
import com.softisland.domain.business.BusinessBackList;

/**
 * @desc 黑名单管理
 * @author zhousg
 * @date 2016年9月5日上午9:52:41
 */
public interface BackListMapper extends BaseMapper<BusinessBackList> {

	/**
	 * 
	 * @Description	检查是否黑名单
	 *
	 * @param pay_email	购买邮箱
	 * @param user_email 用户邮箱
	 * @param ip IP地址
	 * @param delivery_account 递送账户
	 * @param delivery_name 递送名称
	 * 
	 * @return int 大于0 表示黑名单
	 * 
	 * @CreatedDate 2017年5月8日 下午2:34:43
	 * @CreatedUser ynshun
	 * @Version 1.0
	 */
	public int checkBackList(
			@Param(value = "pay_email") String pay_email,
			@Param(value = "user_email") String user_email, @Param(value = "ip") String ip,
			@Param(value = "delivery_account") String delivery_account,
			@Param(value = "delivery_name") String delivery_name);

}
