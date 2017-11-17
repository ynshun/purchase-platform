package com.softisland.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * base entity
 */
@JsonIgnoreProperties(value = { "orderDir", "orderColumn", "start", "length", "draw" })
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = -1262219075375818254L;

	@Transient
	private String orderDir;// ace desc
	@Transient
	private String orderColumn;
	@Transient
	private int start;
	@Transient
	private int length;
	@Transient
	private int draw;
	/********************** 数据库公用的字段 *************************/
	@Id
	private Integer id;
	@Column(name = "create_time")
	private Date create_time;
	@Column(name = "create_id")
	private Integer create_id;
	@Column(name = "create_name")
	private String create_name;
	@Column(name = "update_time")
	private Date update_time;
	@Column(name = "update_name")
	private String update_name;
	@Column(name = "update_id")
	private Integer update_id;
	@Column(name = "status")
	private Integer status;// 1 可以，2 禁用， -1删除

	public String getOrderDir() {
		return orderDir;
	}

	public void setOrderDir(String orderDir) {
		this.orderDir = orderDir;
	}

	public String getOrderColumn() {
		return orderColumn;
	}

	public void setOrderColumn(String orderColumn) {
		this.orderColumn = orderColumn;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Integer getCreate_id() {
		return create_id;
	}

	public void setCreate_id(Integer create_id) {
		this.create_id = create_id;
	}

	public String getCreate_name() {
		return create_name;
	}

	public void setCreate_name(String create_name) {
		this.create_name = create_name;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public String getUpdate_name() {
		return update_name;
	}

	public void setUpdate_name(String update_name) {
		this.update_name = update_name;
	}

	public Integer getUpdate_id() {
		return update_id;
	}

	public void setUpdate_id(Integer update_id) {
		this.update_id = update_id;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
