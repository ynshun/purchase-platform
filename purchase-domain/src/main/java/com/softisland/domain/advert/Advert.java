package com.softisland.domain.advert;

import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

@Table(name = "business_advert")

public class Advert extends BaseEntity {
	private static final long serialVersionUID = -3553082552043582475L;

	// 广告标题
	private String title;

	// 站点id
	private Integer site_id;

	// 广告类型id
	private Integer type_id;

	// 图片地址
	private Integer file_id;

	// 语言版本
	private Integer language;

	// 广告链接
	private String link;

	// 排序
	private Integer order_no;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

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

	public Integer getFile_id() {
		return file_id;
	}

	public void setFile_id(Integer file_id) {
		this.file_id = file_id;
	}

	public Integer getLanguage() {
		return language;
	}

	public void setLanguage(Integer language) {
		this.language = language;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Integer getOrder_no() {
		return order_no;
	}

	public void setOrder_no(Integer order_no) {
		this.order_no = order_no;
	}

}
