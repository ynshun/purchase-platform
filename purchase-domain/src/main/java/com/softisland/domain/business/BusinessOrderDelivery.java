package com.softisland.domain.business;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @desc 订单递送信息
 * @author zhousg
 * @date 2016年9月21日上午11:23:07
 */
@Table(name = "business_order_delivery")
public class BusinessOrderDelivery implements Serializable {
	private static final long serialVersionUID = 2797038882549733775L;

	@Id
	@Column(name = "id")
	Integer id;

	@Column(name = "order_id")
	Integer order_id;

	@Column(name = "delivery_id")
	Integer delivery_id;

	@Column(name = "delivery_value")
	String delivery_value;

	@Column(name = "create_time")
	Date create_time;

	@Transient
	String delivery_name;

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

	public Integer getDelivery_id() {
		return delivery_id;
	}

	public void setDelivery_id(Integer delivery_id) {
		this.delivery_id = delivery_id;
	}

	public String getDelivery_value() {
		return delivery_value;
	}

	public void setDelivery_value(String delivery_value) {
		this.delivery_value = delivery_value;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getDelivery_name() {
		return delivery_name;
	}

	public void setDelivery_name(String delivery_name) {
		this.delivery_name = delivery_name;
	}

}
