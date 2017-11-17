package com.softisland.domain.business;

import javax.persistence.Column;
import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * @desc 黑名单管理
 * @author zhousg
 * @date 2016年9月5日上午9:34:22
 */
@Table(name = "business_back_list")
public class BusinessBackList extends BaseEntity {
	private static final long serialVersionUID = 5379722698128111809L;
	/** 1：付款邮箱 2：登录邮箱 3：IP地址 4：收货账号 **/
	@Column(name = "back_type")
	private Integer back_type;
	/** 账号/邮箱/IP **/
	@Column(name = "content")
	private String content;
	/** 姓名 **/
	@Column(name = "account_name")
	private String account_name;
	/** 详情说明 **/
	@Column(name = "remark")
	private String remark;

	public Integer getBack_type() {
		return back_type;
	}

	public void setBack_type(Integer back_type) {
		this.back_type = back_type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
