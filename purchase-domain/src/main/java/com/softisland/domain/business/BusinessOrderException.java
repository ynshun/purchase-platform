package com.softisland.domain.business;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.softisland.domain.BaseEntity;

/**
 * @desc paypal异常管理
 * @author zhousg
 * @date 2016年9月7日上午11:34:22
 */
@Table(name = "business_order_exception")
public class BusinessOrderException extends BaseEntity {
	private static final long serialVersionUID = -1100196399483420989L;

	@Column(name = "order_id")
	Integer order_id;

	@Column(name = "begin_time")
	Date begin_time;

	@Column(name = "pp_account")
	String pp_account;

	@Column(name = "pp_user")
	String pp_user;

	@Column(name = "pp_trader_no")
	String pp_trader_no;

	@Column(name = "count_money")
	String count_money;

	@Column(name = "fee_money")
	Double fee_money;

	@Column(name = "loss_money")
	Double loss_money;

	@Column(name = "pp_status")
	String pp_status;

	@Column(name = "final_status")
	Integer final_status;

	@Column(name = "remark")
	String remark;
	@Transient
	private String startTime;
	@Transient
	private String endTime;
	@Transient
	private String currency_code;
	@Transient
	private String currency_icon;

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public Date getBegin_time() {
		return begin_time;
	}

	public void setBegin_time(Date begin_time) {
		this.begin_time = begin_time;
	}

	public String getPp_account() {
		return pp_account;
	}

	public void setPp_account(String pp_account) {
		this.pp_account = pp_account;
	}

	public String getPp_user() {
		return pp_user;
	}

	public void setPp_user(String pp_user) {
		this.pp_user = pp_user;
	}

	public String getPp_trader_no() {
		return pp_trader_no;
	}

	public void setPp_trader_no(String pp_trader_no) {
		this.pp_trader_no = pp_trader_no;
	}

	public String getCount_money() {
		return count_money;
	}

	public void setCount_money(String count_money) {
		this.count_money = count_money;
	}

	public Double getFee_money() {
		return fee_money;
	}

	public void setFee_money(Double fee_money) {
		this.fee_money = fee_money;
	}

	public Double getLoss_money() {
		return loss_money;
	}

	public void setLoss_money(Double loss_money) {
		this.loss_money = loss_money;
	}

	public String getPp_status() {
		return pp_status;
	}

	public void setPp_status(String pp_status) {
		this.pp_status = pp_status;
	}

	public Integer getFinal_status() {
		return final_status;
	}

	public void setFinal_status(Integer final_status) {
		this.final_status = final_status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getCurrency_code() {
		return currency_code;
	}

	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}

	public String getCurrency_icon() {
		return currency_icon;
	}

	public void setCurrency_icon(String currency_icon) {
		this.currency_icon = currency_icon;
	}

}
