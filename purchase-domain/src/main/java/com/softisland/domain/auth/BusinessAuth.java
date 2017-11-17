package com.softisland.domain.auth;

import com.softisland.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 
 * @description: 用户认证管理
 *
 * @createdTime: 2017年11月13日 下午2:12:18
 * @createdUser: ynshun
 * @version: 1.0
 */
@Table(name = "business_auth")
public class BusinessAuth extends BaseEntity {
	private static final long serialVersionUID = 955116466277518108L;

	// 主键id
	@Id
	@Column(name = "id")
	private Integer id;

	// order_id
	@Column(name = "order_id")
	private Integer order_id;

	// 用户Id
	@Column(name = "user_id")
	private Integer user_id;

	// 用户邮箱
	@Column(name = "user_email")
	private String user_email;

	// 客户名称
	@Column(name = "customer_name")
	private String customer_name;

	// paypal邮箱
	@Column(name = "paypal_email")
	private String paypal_email;

	// 审核说明
	@Column(name = "auth_desc")
	private String auth_desc;

	// 审核时间
	@Column(name = "review_time")
	private Date review_time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getPaypal_email() {
		return paypal_email;
	}

	public void setPaypal_email(String paypal_email) {
		this.paypal_email = paypal_email;
	}

	public String getAuth_desc() {
		return auth_desc;
	}

	public void setAuth_desc(String auth_desc) {
		this.auth_desc = auth_desc;
	}

	public Date getReview_time() {
		return review_time;
	}

	public void setReview_time(Date review_time) {
		this.review_time = review_time;
	}

}
