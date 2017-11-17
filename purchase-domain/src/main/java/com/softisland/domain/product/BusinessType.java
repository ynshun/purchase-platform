package com.softisland.domain.product;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * @desc 业务类型
 * @author chenyu
 * @date 2016年8月24日上午11:07:16
 */

@Table(name = "business_type")
public class BusinessType extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "type")
	private String type;

	@Column(name = "parent_type_id")
	private Integer parent_type_id;

	@Column(name = "wap_image")
	private String wap_image;

	@Column(name = "web_image")
	private String web_image;

	@Column(name = "type_image")
	private String type_image;

	@Column(name = "url")
	private String url;

	@Column(name = "sort")
	private Integer sort;
	// 是否IP限制 1 是 0 否
	@Column(name = "ip_limit")
	private Integer ip_limit;

	@Column(name = "status")
	private Integer status;

	// seo-标题
	@Column(name = "seo_title")
	private String seo_title;
	// seo-关键字
	@Column(name = "seo_keywords")
	private String seo_keywords;
	// seo-描述
	@Column(name = "seo_description")
	private String seo_description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getParent_type_id() {
		return parent_type_id;
	}

	public void setParent_type_id(Integer parent_type_id) {
		this.parent_type_id = parent_type_id;
	}

	public String getWap_image() {
		return wap_image;
	}

	public void setWap_image(String wap_image) {
		this.wap_image = wap_image;
	}

	public String getWeb_image() {
		return web_image;
	}

	public void setWeb_image(String web_image) {
		this.web_image = web_image;
	}

	public String getType_image() {
		return type_image;
	}

	public void setType_image(String type_image) {
		this.type_image = type_image;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getIp_limit() {
		return ip_limit;
	}

	public void setIp_limit(Integer ip_limit) {
		this.ip_limit = ip_limit;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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
