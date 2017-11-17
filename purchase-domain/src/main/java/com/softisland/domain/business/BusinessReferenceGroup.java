package com.softisland.domain.business;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * @desc 来源分组
 * @author chenyu
 * @date 2016年11月16日10:35:37
 */
@Table(name = "reference_group")
public class BusinessReferenceGroup extends BaseEntity {
	private static final long serialVersionUID = -7517991880989232773L;

	@Id
	@Column(name = "id")
	private Integer id;

	/** 来源分组的名称 **/
	@Column(name = "name")
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
