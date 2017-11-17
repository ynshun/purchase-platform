package com.softisland.domain.business;

import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * Created by ynshun on 2017/7/26.
 */
@Table(name = "business_order_password")

public class BusinessOrderPassword extends BaseEntity {
	private static final long serialVersionUID = -871833296751887392L;
	// 订单号
	private Integer order_id;
	// 密码字符串
	private String password;
	// 有效期（单位：秒）
	private Long expire;

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getExpire() {
		return expire;
	}

	public void setExpire(Long expire) {
		this.expire = expire;
	}

}
