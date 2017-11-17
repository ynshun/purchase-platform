package com.softisland.domain.business;

import javax.persistence.Column;
import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * @desc 支付方式
 * @author zoudong
 * @date 2016年9月5日上午9:26:16
 */
@Table(name = "business_currency")
public class BusinessCurrency extends BaseEntity {
	private static final long serialVersionUID = 4653491388707673309L;

	@Column(name = "currency_code")
	private String currency_code;
	@Column(name = "currency_name")
	private String currency_name;
	@Column(name = "currency_icon")
	private String currency_icon;

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

	public String getCurrency_icon() {
		return currency_icon;
	}

	public void setCurrency_icon(String currency_icon) {
		this.currency_icon = currency_icon;
	}

}
