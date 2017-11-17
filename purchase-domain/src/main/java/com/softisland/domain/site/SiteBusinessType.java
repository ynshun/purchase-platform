package com.softisland.domain.site;

import javax.persistence.Column;
import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * 站点-业务类型关系表
 * 
 * @author ynshun
 */
@Table(name = "site_business_type")
public class SiteBusinessType extends BaseEntity {
	private static final long serialVersionUID = -1887114106685153672L;

	// 站点Id
	@Column(name = "site_id")
	private Integer site_id;

	// 业务类型Id
	@Column(name = "type_id")
	private Integer type_id;

	// 排序号
	@Column(name = "sort")
	private Integer sort;

	// seo-标题
	@Column(name = "seo_title")
	private String seo_title;
	// seo-关键字
	@Column(name = "seo_keywords")
	private String seo_keywords;
	// seo-描述
	@Column(name = "seo_description")
	private String seo_description;

	public Integer getSite_id() {
		return site_id;
	}

	public void setSite_id(Integer site_id) {
		this.site_id = site_id;
	}

	public Integer getType_id() {
		return type_id;
	}

	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getSeo_title() {
		return seo_title;
	}

	public void setSeo_title(String seo_title) {
		this.seo_title = seo_title;
	}

	public String getSeo_keywords() {
		return seo_keywords;
	}

	public void setSeo_keywords(String seo_keywords) {
		this.seo_keywords = seo_keywords;
	}

	public String getSeo_description() {
		return seo_description;
	}

	public void setSeo_description(String seo_description) {
		this.seo_description = seo_description;
	}

}
