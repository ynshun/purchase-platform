package com.softisland.domain.product;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.softisland.domain.BaseEntity;

/**
 * The type Product spec.
 *
 * @author zoudong
 * @desc 商品规格
 * @date 2016年8月25日上午9 :39:16
 */
@Table(name = "product_spec")
public class ProductSpec extends BaseEntity {
	private static final long serialVersionUID = -1205997318999936227L;

	/** 产品、服务名称 **/
	@Column(name = "p_id")
	private Integer p_id;

	/** 产品名称 **/
	@Transient
	private String p_name;

	/** 产品规格名称 **/
	@Column(name = "name")
	private String name;

	/** 产品价格 */
	@Column(name = "spec_num")
	private Double spec_num;

	@Transient
	private ProductPrice productPrice;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSpec_num() {
		return spec_num;
	}

	public void setSpec_num(Double spec_num) {
		this.spec_num = spec_num;
	}

	public ProductPrice getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(ProductPrice productPrice) {
		this.productPrice = productPrice;
	}

}
