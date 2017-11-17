package com.softisland.domain.business;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @desc 用户-产品递送信息-详情
 * @author zhousg
 * @date 2017年4月21日下午3:45:16
 */
@Table(name = "business_product_deliver_detail")
public class BusinessProductDeliverDetail implements Serializable {
	private static final long serialVersionUID = 5821495338180604062L;

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "product_deliver_id")
	private Integer product_deliver_id;

	@Column(name = "delivery_id")
	private Integer delivery_id;

	@Column(name = "delivery_value")
	private String delivery_value;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProduct_deliver_id() {
		return product_deliver_id;
	}

	public void setProduct_deliver_id(Integer product_deliver_id) {
		this.product_deliver_id = product_deliver_id;
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

}
