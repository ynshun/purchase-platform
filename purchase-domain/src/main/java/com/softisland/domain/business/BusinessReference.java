package com.softisland.domain.business;

import javax.persistence.Column;
import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * @desc 来源分组
 * @author chenyu
 * @date 2016年11月16日10:39:37
 */
@Table(name = "Reference")

public class BusinessReference extends BaseEntity {
	private static final long serialVersionUID = 3371298685860900941L;

	/** 来源名称 **/
	@Column(name = "name")
	private String name;

	/** 来源分组Id **/
	@Column(name = "group_id")
	private Integer group_id;

	/** 匹配关键字 **/
	@Column(name = "key_word")
	private String key_word;

	/** 来源描述 **/
	@Column(name = "remark")
	private String remark;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGroup_id() {
		return group_id;
	}

	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}

	public String getKey_word() {
		return key_word;
	}

	public void setKey_word(String key_word) {
		this.key_word = key_word;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
