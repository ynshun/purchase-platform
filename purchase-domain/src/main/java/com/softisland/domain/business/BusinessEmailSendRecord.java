package com.softisland.domain.business;

import javax.persistence.Column;
import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * @desc 邮件发送历史
 * @author zhousg
 * @date 2016年10月17日上午10:15:59
 */
@Table(name = "business_email_send_record")
public class BusinessEmailSendRecord extends BaseEntity {
	private static final long serialVersionUID = 2275269644583323459L;

	/** 站点Id **/
	@Column(name = "site_id")
	private Integer site_id;
	/** 邮件模板Id **/
	@Column(name = "template_id")
	private Integer template_id;
	/** WebPower模板Id **/
	@Column(name = "webpower_id")
	private Integer webpower_id;
	/** 邮件标题 **/
	@Column(name = "email_title")
	private String email_title;
	/** 邮件内容 **/
	@Column(name = "email_content")
	private String email_content;
	/** 收件邮箱 **/
	@Column(name = "send_email")
	private String send_email;
	/** 订单Id **/
	@Column(name = "order_id")
	private Integer order_id;
	/** 用户Id **/
	@Column(name = "user_id")
	private Integer user_id;

	public Integer getSite_id() {
		return site_id;
	}

	public void setSite_id(Integer site_id) {
		this.site_id = site_id;
	}

	public Integer getTemplate_id() {
		return template_id;
	}

	public void setTemplate_id(Integer template_id) {
		this.template_id = template_id;
	}

	public Integer getWebpower_id() {
		return webpower_id;
	}

	public void setWebpower_id(Integer webpower_id) {
		this.webpower_id = webpower_id;
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

	public String getSend_email() {
		return send_email;
	}

	public void setSend_email(String send_email) {
		this.send_email = send_email;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

}
