package com.softisland.domain.product;

import com.softisland.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 推荐商品
 */

@Table(name = "product_recommend")
public class ProductRecommend extends BaseEntity {
	private static final long serialVersionUID = 7609249358458877465L;

	@Column(name = "site_id")
	private Integer site_id;

	@Column(name = "product_id")
	private Integer product_id;

	@Column(name = "first_type_id")
	private Integer first_type_id;

	@Column(name = "second_type_id")
	private Integer second_type_id;

	@Column(name = "product_spec_id")
	private Integer product_spec_id;

	@Column(name = "price_id")
	private Integer price_id;

	public Integer getSite_id() {
		return site_id;
	}

	public void setSite_id(Integer site_id) {
		this.site_id = site_id;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public Integer getFirst_type_id() {
		return first_type_id;
	}

	public void setFirst_type_id(Integer first_type_id) {
		this.first_type_id = first_type_id;
	}

	public Integer getSecond_type_id() {
		return second_type_id;
	}

	public void setSecond_type_id(Integer second_type_id) {
		this.second_type_id = second_type_id;
	}

	public Integer getProduct_spec_id() {
		return product_spec_id;
	}

	public void setProduct_spec_id(Integer product_spec_id) {
		this.product_spec_id = product_spec_id;
	}

	public Integer getPrice_id() {
		return price_id;
	}

	public void setPrice_id(Integer price_id) {
		this.price_id = price_id;
	}

}
