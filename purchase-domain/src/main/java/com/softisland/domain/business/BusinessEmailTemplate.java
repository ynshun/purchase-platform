package com.softisland.domain.business;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.softisland.domain.BaseEntity;

/**
 * @desc 邮件模板
 * @author zhousg
 * @date 2016年10月17日上午10:15:59
 */
@Table(name = "business_email_template")
public class BusinessEmailTemplate extends BaseEntity {
	private static final long serialVersionUID = 2450251151968539894L;

	/** 站点Id **/
	@Column(name = "site_id")
	private Integer site_id;
	/** WebPower模板Id **/
	@Column(name = "webpower_id")
	private Integer webpower_id;
	/** 邮件主题 **/
	@Column(name = "email_subject")
	private String email_subject;
	/** 邮件标题 **/
	@Column(name = "email_title")
	private String email_title;
	/** 邮件内容 **/
	@Column(name = "email_content")
	private String email_content;
	@Transient
	private String site_name;// 站点名称

	public Integer getSite_id() {
		return site_id;
	}

	public void setSite_id(Integer site_id) {
		this.site_id = site_id;
	}

	public Integer getWebpower_id() {
		return webpower_id;
	}

	public void setWebpower_id(Integer webpower_id) {
		this.webpower_id = webpower_id;
	}

	public String getEmail_subject() {
		return email_subject;
	}

	public void setEmail_subject(String email_subject) {
		this.email_subject = email_subject;
	}

	public String getEmail_title() {
		return email_title;
	}

	public void setEmail_title(String email_title) {
		this.email_title = email_title;
	}

	public String getEmail_content() {
		return email_content;
	}

	public void setEmail_content(String email_content) {
		this.email_content = email_content;
	}

	public String getSite_name() {
		return site_name;
	}

	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}

}
