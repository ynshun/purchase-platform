package com.softisland.domain.business;

import com.softisland.domain.BaseEntity;

import java.util.Date;

import javax.persistence.Table;

/**
 * Created by Administrator on 2016/9/7.
 */
@Table(name = "business_order_log")

public class BusinessOrderLog extends BaseEntity {
	private static final long serialVersionUID = -8944942207736052968L;
	private Integer order_id;
	private Integer log_type;
	private Date operate_time;
	private String operate_user;
	private String before_status;
	private String after_status;
	private Integer operate_type;
	private String before_trader_no;
	private String after_trader_no;
	private String content;
	private String upload_resource;
	private Integer file_id;

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public Integer getLog_type() {
		return log_type;
	}

	public void setLog_type(Integer log_type) {
		this.log_type = log_type;
	}

	public Date getOperate_time() {
		return operate_time;
	}

	public void setOperate_time(Date operate_time) {
		this.operate_time = operate_time;
	}

	public String getOperate_user() {
		return operate_user;
	}

	public void setOperate_user(String operate_user) {
		this.operate_user = operate_user;
	}

	public String getBefore_status() {
		return before_status;
	}

	public void setBefore_status(String before_status) {
		this.before_status = before_status;
	}

	public String getAfter_status() {
		return after_status;
	}

	public void setAfter_status(String after_status) {
		this.after_status = after_status;
	}

	public Integer getOperate_type() {
		return operate_type;
	}

	public void setOperate_type(Integer operate_type) {
		this.operate_type = operate_type;
	}

	public String getBefore_trader_no() {
		return before_trader_no;
	}

	public void setBefore_trader_no(String before_trader_no) {
		this.before_trader_no = before_trader_no;
	}

	public String getAfter_trader_no() {
		return after_trader_no;
	}

	public void setAfter_trader_no(String after_trader_no) {
		this.after_trader_no = after_trader_no;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUpload_resource() {
		return upload_resource;
	}

	public void setUpload_resource(String upload_resource) {
		this.upload_resource = upload_resource;
	}

	public Integer getFile_id() {
		return file_id;
	}

	public void setFile_id(Integer file_id) {
		this.file_id = file_id;
	}

}
