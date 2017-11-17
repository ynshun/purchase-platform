package com.softisland.domain.site;

import javax.persistence.Column;
import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * 站点和产品中间表
 * 
 * @desc
 * @author zhousg
 * @date 2016年8月26日下午2:13:18
 */
@Table(name = "site_vs_product")
public class SiteVsProduct extends BaseEntity {
	private static final long serialVersionUID = 1L;
	/** 站点Id **/
	@Column(name = "site_id")
	private Integer site_id;
	/** 价格Id **/
	@Column(name = "price_id")
	private Integer price_id;
	/** 产品规格Id **/
	@Column(name = "spec_id")
	private Integer spec_id;
	/** 产品服务Id **/
	@Column(name = "p_id")
	private Integer p_id;

	public Integer getSite_id() {
		return site_id;
	}

	public void setSite_id(Integer site_id) {
		this.site_id = site_id;
	}

	public Integer getPrice_id() {
		return price_id;
	}

	public void setPrice_id(Integer price_id) {
		this.price_id = price_id;
	}

	public Integer getSpec_id() {
		return spec_id;
	}

	public void setSpec_id(Integer spec_id) {
		this.spec_id = spec_id;
	}

	public Integer getP_id() {
		return p_id;
	}

	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}

}
