package com.softisland.domain.business;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.softisland.domain.BaseEntity;

/**
 * 打赏日志记录表
 */

@Table(name = "business_reward_log")
public class BusinessRewardLog extends BaseEntity {
	private static final long serialVersionUID = 7539780361865739420L;

	@Column(name = "order_id")
	private Integer order_id;

	@Column(name = "user_id")
	private Integer user_id;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "product_name")
	private String product_name;

	@Column(name = "pay_type")
	private Integer pay_type;

	@Column(name = "reward_status")
	private Integer reward_status;

	@Column(name = "pay_status")
	private String pay_status;

	@Column(name = "pay_time")
	private Date pay_time;

	@Column(name = "datetime")
	private Date datetime;

	@Column(name = "party3_id")
	private Integer party3_id;

	@Column(name = "remark")
	private String remark;

	@Transient
	private String username;

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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Integer getPay_type() {
		return pay_type;
	}

	public void setPay_type(Integer pay_type) {
		this.pay_type = pay_type;
	}

	public Integer getReward_status() {
		return reward_status;
	}

	public void setReward_status(Integer reward_status) {
		this.reward_status = reward_status;
	}

	public String getPay_status() {
		return pay_status;
	}

	public void setPay_status(String pay_status) {
		this.pay_status = pay_status;
	}

	public Date getPay_time() {
		return pay_time;
	}

	public void setPay_time(Date pay_time) {
		this.pay_time = pay_time;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public Integer getParty3_id() {
		return party3_id;
	}

	public void setParty3_id(Integer party3_id) {
		this.party3_id = party3_id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
