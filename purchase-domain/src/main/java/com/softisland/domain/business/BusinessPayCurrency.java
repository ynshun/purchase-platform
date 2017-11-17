package com.softisland.domain.business;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @desc 支持货币
 * @author zoudong
 * @date 2016年9月5日上午9:26:16
 */
@Table(name = "business_pay_currency")
public class BusinessPayCurrency implements Serializable {
	private static final long serialVersionUID = -9050431720451228063L;

	@Transient
	private Integer id;
	@Column(name = "pay_id")
	private Integer pay_id;
	@Column(name = "currency_id")
	private Integer currency_id;

	@Transient
	private String currency_code;
	@Transient
	private String currency_name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPay_id() {
		return pay_id;
	}

	public void setPay_id(Integer pay_id) {
		this.pay_id = pay_id;
	}

	public Integer getCurrency_id() {
		return currency_id;
	}

	public void setCurrency_id(Integer currency_id) {
		this.currency_id = currency_id;
	}

	public String getCurrency_code() {
		return currency_code;
	}

	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}

	public String getCurrency_name() {
		return currency_name;
	}

	public void setCurrency_name(String currency_name) {
		this.currency_name = currency_name;
	}

}
