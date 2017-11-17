package com.softisland.domain.site;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 站点和产品中间表
 * 
 * @desc
 * @author zhousg
 * @date 2016年8月26日下午2:13:18
 */
@Table(name = "site_pay")
public class SitePay implements Serializable {
	private static final long serialVersionUID = 1L;

	/** id **/
	@Column(name = "id")
	private Integer id;

	/** 站点Id **/
	@Column(name = "site_id")
	private Integer site_id;

	@Column(name = "pay_id")
	/** 支付方式Id **/
	private Integer pay_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSite_id() {
		return site_id;
	}

	public void setSite_id(Integer site_id) {
		this.site_id = site_id;
	}

	public Integer getPay_id() {
		return pay_id;
	}

	public void setPay_id(Integer pay_id) {
		this.pay_id = pay_id;
	}

}
