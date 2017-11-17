package com.softisland.domain.site;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.softisland.domain.BaseEntity;

/**
 * 站点管理
 */
@Table(name = "site_manager")
public class SiteManager extends BaseEntity {
	private static final long serialVersionUID = -704688604076566110L;

	@Column(name = "site_name")
	private String site_name;
	@Column(name = "site_logo")
	private String site_logo;
	@Column(name = "site_url")
	private String site_url;

	// seo-标题
	@Column(name = "seo_title")
	private String seo_title;
	// seo-关键字
	@Column(name = "seo_keywords")
	private String seo_keywords;
	// seo-描述
	@Column(name = "seo_description")
	private String seo_description;
	@Transient
	private String bttonOption;

	@Column(name = "client_code")
	private String client_code;

	public String getSite_name() {
		return site_name;
	}

	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}

	public String getSite_logo() {
		return site_logo;
	}

	public void setSite_logo(String site_logo) {
		this.site_logo = site_logo;
	}

	public String getSite_url() {
		return site_url;
	}

	public void setSite_url(String site_url) {
		this.site_url = site_url;
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

	public String getBttonOption() {
		return bttonOption;
	}

	public void setBttonOption(String bttonOption) {
		this.bttonOption = bttonOption;
	}

	public String getClient_code() {
		return client_code;
	}

	public void setClient_code(String client_code) {
		this.client_code = client_code;
	}

}
