package com.softisland.domain.business;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @desc 邮件参数
 * @author zhousg
 * @date 2016年10月17日下午2:34:36
 */
@Table(name = "business_email_param")
public class BusinessEmailParam implements Serializable {
	private static final long serialVersionUID = 9015433650705259097L;
	/** 站点Id **/
	@Id
	@Column(name = "id")
	private Integer id;
	/** WebPower模板Id **/
	@Column(name = "template_id")
	private Integer template_id;
	/** 邮件主题 **/
	@Column(name = "param_value")
	private String param_value;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTemplate_id() {
		return template_id;
	}

	public void setTemplate_id(Integer template_id) {
		this.template_id = template_id;
	}

	public String getParam_value() {
		return param_value;
	}

	public void setParam_value(String param_value) {
		this.param_value = param_value;
	}

}
