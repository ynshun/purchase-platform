package com.softisland.basic.business.service;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softisland.base.BaseMapper;
import com.softisland.base.BaseService;
import com.softisland.basic.business.mapper.BackListMapper;
import com.softisland.bean.response.CheckAllow;
import com.softisland.bean.response.UCenterResponse;
import com.softisland.core.UCenterClient;
import com.softisland.domain.business.BusinessBackList;

@Service
@Transactional
public class BusinessBackListService extends BaseService<BusinessBackList> {
	@Resource
	private BackListMapper backListMapper;
	
    private UCenterClient ucenterClient;
	
	/**
	 * @desc 检查是否黑名单
	 * @author zhousg
	 * @date 2016年9月21日下午2:05:53
	 * @param pay_email  购买邮箱
	 * @param user_email 用户有奖
	 * @param ip IP地址
	 * @param delivery_account  递送账户
	 * @param delivery_name  递送名称
	 * @return
	 */
	public boolean checkBackList(String pay_email,String user_email,String ip,String delivery_account,String delivery_name){
		int countNum = backListMapper.checkBackList(pay_email, user_email, ip, delivery_account, delivery_name);
		return countNum <= 0;
	}
	
	
	/**
	 * @desc 检查是否黑名单(通过用户中心)
	 * @author zhousg
	 * @date 2016年9月21日下午2:05:53
	 * @param pay_email  购买邮箱
	 * @param user_email 用户有奖
	 * @param ip IP地址
	 * @param delivery_account  递送账户
	 * @param delivery_name  递送名称
	 * @return
	 */
	public boolean checkBackListByUCenter(String pay_email,String user_email,String ip,String delivery_account,String delivery_name){
		UCenterResponse<CheckAllow> checkResult = new UCenterResponse<>();
		//购买邮件
		if(null != pay_email && !"".equals(pay_email)){
			checkResult = ucenterClient.checkPayAccountAllowReply("any",pay_email);
			if(!checkResult.getData().getCheck_result()){
				return false;
			}
		}
		//用户邮箱
		checkResult = ucenterClient.checkEmailAccountAllowReply(user_email);
		if(!checkResult.getData().getCheck_result()){
			return false;
		}
		//IP
		checkResult = ucenterClient.checkIpAllowReply(ip);
		if(!checkResult.getData().getCheck_result()){
			return false;
		}
		//递送账户
		if(StringUtils.isNotEmpty(delivery_account)){
			checkResult = ucenterClient.checkReceiveAccountAllowReply(delivery_account);
			if(!checkResult.getData().getCheck_result()){
				return false;
			}
		}
		return true;
	}


	@Override
	protected BaseMapper<BusinessBackList> getMapper() {
		return backListMapper;
	}
}
