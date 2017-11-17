package com.softisland.domain.product;

import javax.persistence.Column;
import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * @desc 售后价格
 * @author zhousg
 * @date 2016年8月24日上午10:26:16
 */
@Table(name = "product_customer_service")
public class ProductCustomerService extends BaseEntity {
	private static final long serialVersionUID = -6827633760579790513L;

	@Column(name = "name")
	private String name;

	@Column(name = "content")
	private String content;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
