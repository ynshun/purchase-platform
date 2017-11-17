package com.softisland.domain.news;

import com.softisland.domain.BaseEntity;

/**
 * 新闻类型列表 Created on 2016年10月20日
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
public class NewsTypeVo extends BaseEntity {
	private static final long serialVersionUID = 7800742330653133749L;

	private String site_name;

	private String name;

	private String type_id;

	private String site_id;

	public String getSite_name() {
		return site_name;
	}

	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType_id() {
		return type_id;
	}

	public void setType_id(String type_id) {
		this.type_id = type_id;
	}

	public String getSite_id() {
		return site_id;
	}

	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}

}
