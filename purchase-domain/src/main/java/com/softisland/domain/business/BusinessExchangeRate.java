package com.softisland.domain.business;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @desc 数据库中存的汇率
 * @author zhousg
 * @date 2016年10月10日上午10:41:02
 */
@Table(name = "business_exchange_rate")
public class BusinessExchangeRate implements Serializable {
	private static final long serialVersionUID = 3154807889934226254L;

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "currency_code")
	private String currency_code;

	@Column(name = "rate")
	private Double rate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCurrency_code() {
		return currency_code;
	}

	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

}
