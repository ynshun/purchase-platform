package com.softisland.domain.system;

import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

@Table(name = "classfication")
public class Classfication extends BaseEntity {
	private static final long serialVersionUID = -766088703897395312L;

	// 配置名称
	private String name;
	// 品日志描述
	private String descr;
	// 配置分类标识
	private String d_type;
	// 配置唯一标识
	private String code;
	// 上级ID
	private Integer p_id;
	// 配置值
	private String value;
	// 配置所属域
	private String domain;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getD_type() {
		return d_type;
	}

	public void setD_type(String d_type) {
		this.d_type = d_type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getP_id() {
		return p_id;
	}

	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

}
