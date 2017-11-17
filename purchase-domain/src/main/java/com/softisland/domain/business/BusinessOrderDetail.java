package com.softisland.domain.business;

import java.io.Serializable;

import javax.persistence.Table;

@Table(name = "business_order_detail")
public class BusinessOrderDetail implements Serializable {
	private static final long serialVersionUID = -3985939472260674916L;

	Integer id;// (编号) PK
	Integer order_id;// (订单编号) FK
	Integer spec_id;// (产品规格Id) Integer
	String spec_name;// (规格名称) String
	Integer spec_number;// (规格数量) Integer
	Double unit_price;// (单价) Float
	Integer buy_number;// (购买数量) Integer
	Double count_money;// (总价) Float
	Double count_cost_price;// (成本价) Float //产品的成本单价*购买数量
	String extend_str_data; // 字符型扩展数据
	Double extend_number_data; // 数值型扩展数据

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

	public Integer getSpec_id() {
		return spec_id;
	}

	public void setSpec_id(Integer spec_id) {
		this.spec_id = spec_id;
	}

	public String getSpec_name() {
		return spec_name;
	}

	public void setSpec_name(String spec_name) {
		this.spec_name = spec_name;
	}

	public Integer getSpec_number() {
		return spec_number;
	}

	public void setSpec_number(Integer spec_number) {
		this.spec_number = spec_number;
	}

	public Double getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(Double unit_price) {
		this.unit_price = unit_price;
	}

	public Integer getBuy_number() {
		return buy_number;
	}

	public void setBuy_number(Integer buy_number) {
		this.buy_number = buy_number;
	}

	public Double getCount_money() {
		return count_money;
	}

	public void setCount_money(Double count_money) {
		this.count_money = count_money;
	}

	public Double getCount_cost_price() {
		return count_cost_price;
	}

	public void setCount_cost_price(Double count_cost_price) {
		this.count_cost_price = count_cost_price;
	}

	public String getExtend_str_data() {
		return extend_str_data;
	}

	public void setExtend_str_data(String extend_str_data) {
		this.extend_str_data = extend_str_data;
	}

	public Double getExtend_number_data() {
		return extend_number_data;
	}

	public void setExtend_number_data(Double extend_number_data) {
		this.extend_number_data = extend_number_data;
	}

}
