package com.softisland.domain.product;

import javax.persistence.Column;
import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * @desc 商品价格
 * @author zhousg
 * @date 2016年8月24日上午10:26:16
 */
@Table(name = "product_price")

public class ProductPrice extends BaseEntity {
	private static final long serialVersionUID = -1914764220058076882L;

	@Column(name = "sale_price")
	private Double sale_price;

	@Column(name = "sale_rate")
	private Double sale_rate;

	@Column(name = "special_price")
	private Double special_price;

	@Column(name = "special_rate")
	private Double special_rate;

	@Column(name = "product_spec_id")
	private Integer product_spec_id;

	@Column(name = "site_id")
	private Integer site_id;

	@Column(name = "create_exchange_rate")
	private Double create_exchange_rate;

	public Double getSale_price() {
		return sale_price;
	}

	public void setSale_price(Double sale_price) {
		this.sale_price = sale_price;
	}

	public Double getSale_rate() {
		return sale_rate;
	}

	public void setSale_rate(Double sale_rate) {
		this.sale_rate = sale_rate;
	}

	public Double getSpecial_price() {
		return special_price;
	}

	public void setSpecial_price(Double special_price) {
		this.special_price = special_price;
	}

	public Double getSpecial_rate() {
		return special_rate;
	}

	public void setSpecial_rate(Double special_rate) {
		this.special_rate = special_rate;
	}

	public Integer getProduct_spec_id() {
		return product_spec_id;
	}

	public void setProduct_spec_id(Integer product_spec_id) {
		this.product_spec_id = product_spec_id;
	}

	public Integer getSite_id() {
		return site_id;
	}

	public void setSite_id(Integer site_id) {
		this.site_id = site_id;
	}

	public Double getCreate_exchange_rate() {
		return create_exchange_rate;
	}

	public void setCreate_exchange_rate(Double create_exchange_rate) {
		this.create_exchange_rate = create_exchange_rate;
	}

}
