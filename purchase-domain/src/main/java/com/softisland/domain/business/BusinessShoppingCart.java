package com.softisland.domain.business;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = "business_shopcart")
public class BusinessShoppingCart {
	@Id
	@Column(name = "id")
	Integer id;

	@Column(name = "user_id")
	Integer user_id;

	@Column(name = "p_id")
	Integer p_id;

	@Column(name = "p_name")
	String p_name;

	@Column(name = "spec_id")
	Integer spec_id;

	@Column(name = "spec_name")
	String spec_name;

	@Column(name = "sale_amount")
	Double sale_amount;

	@Column(name = "original_price")
	Double original_price;

	@Column(name = "sale_price")
	Double sale_price;

	@Column(name = "num")
	Integer num;

	@Column(name = "ip")
	String ip;

	@Column(name = "currency_code")
	String currency_code;

	@Column(name = "create_time")
	Date create_time;

	@Column(name = "site_id")
	Integer site_id;

	@Column(name = "update_time")
	Date update_time;

	@Column(name = "status")
	Integer status;

	@Column(name = "order_id")
	Integer order_id;

	@Column(name = "extend_note")
	String extend_note;

	@Transient
	private String purchase_str;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getP_id() {
		return p_id;
	}

	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
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

	public Double getSale_amount() {
		return sale_amount;
	}

	public void setSale_amount(Double sale_amount) {
		this.sale_amount = sale_amount;
	}

	public Double getOriginal_price() {
		return original_price;
	}

	public void setOriginal_price(Double original_price) {
		this.original_price = original_price;
	}

	public Double getSale_price() {
		return sale_price;
	}

	public void setSale_price(Double sale_price) {
		this.sale_price = sale_price;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getCurrency_code() {
		return currency_code;
	}

	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Integer getSite_id() {
		return site_id;
	}

	public void setSite_id(Integer site_id) {
		this.site_id = site_id;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public String getExtend_note() {
		return extend_note;
	}

	public void setExtend_note(String extend_note) {
		this.extend_note = extend_note;
	}

	public String getPurchase_str() {
		return purchase_str;
	}

	public void setPurchase_str(String purchase_str) {
		this.purchase_str = purchase_str;
	}

}