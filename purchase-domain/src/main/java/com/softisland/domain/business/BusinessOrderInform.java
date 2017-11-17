package com.softisland.domain.business;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

@Table(name = "business_order_inform")
public class BusinessOrderInform extends BaseEntity {
	private static final long serialVersionUID = 8574776416165500416L;
	@Column(name = "user_id")
	private Integer user_id;
	@Column(name = "pay_status")
	private Integer pay_status;
	@Column(name = "first_warn_minutes")
	private Integer first_warn_minutes;
	@Column(name = "for_warn_minutes")
	private Integer for_warn_minutes;
	@Column(name = "warn_time")
	private Date warn_time;
	@Column(name = "is_read")
	private Integer is_read;

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getPay_status() {
		return pay_status;
	}

	public void setPay_status(Integer pay_status) {
		this.pay_status = pay_status;
	}

	public Integer getFirst_warn_minutes() {
		return first_warn_minutes;
	}

	public void setFirst_warn_minutes(Integer first_warn_minutes) {
		this.first_warn_minutes = first_warn_minutes;
	}

	public Integer getFor_warn_minutes() {
		return for_warn_minutes;
	}

	public void setFor_warn_minutes(Integer for_warn_minutes) {
		this.for_warn_minutes = for_warn_minutes;
	}

	public Date getWarn_time() {
		return warn_time;
	}

	public void setWarn_time(Date warn_time) {
		this.warn_time = warn_time;
	}

	public Integer getIs_read() {
		return is_read;
	}

	public void setIs_read(Integer is_read) {
		this.is_read = is_read;
	}

}
