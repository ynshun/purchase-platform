package com.softisland.domain.advert;

import javax.persistence.Column;
import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * 广告类型
 * 
 * Created on 2016年10月18日
 * <p>
 * Copyright: Copyright (c) 2016
 * </p>
 * <p>
 * Company: 软岛
 * </p>
 * 
 * @author chenhaibo
 * @version 1.0
 */
@Table(name = "business_advert_type")
public class AdvertType extends BaseEntity {
	private static final long serialVersionUID = 662023001868282542L;

	// 广告类型名称
	@Column(name = "name")
	private String name;

	// 广告类型id
	@Column(name = "type_id")
	private Integer type_id;

	// 站点id
	@Column(name = "site_id")
	private Integer site_id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType_id() {
		return type_id;
	}

	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}

	public Integer getSite_id() {
		return site_id;
	}

	public void setSite_id(Integer site_id) {
		this.site_id = site_id;
	}

}
