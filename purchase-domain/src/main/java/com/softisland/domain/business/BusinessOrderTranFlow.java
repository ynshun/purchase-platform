package com.softisland.domain.business;

import com.softisland.domain.BaseEntity;

public class BusinessOrderTranFlow extends BaseEntity {
	private static final long serialVersionUID = 8064304269470350573L;
	private String order_id;
	private String trader_no;
	private Double money;

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getTrader_no() {
		return trader_no;
	}

	public void setTrader_no(String trader_no) {
		this.trader_no = trader_no;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

}
