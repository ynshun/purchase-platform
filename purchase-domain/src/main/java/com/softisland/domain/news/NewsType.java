package com.softisland.domain.news;

import javax.persistence.Column;
import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * 新闻类型 Created on 2016年10月21日
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
@Table(name = "business_news_type")
public class NewsType extends BaseEntity {
	private static final long serialVersionUID = 7535665289770998423L;

	// 新闻类型名称
	@Column(name = "name")
	private String name;

	// 自定义新闻类型id
	@Column(name = "type_id")
	private Integer type_id;

	// 站点
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
