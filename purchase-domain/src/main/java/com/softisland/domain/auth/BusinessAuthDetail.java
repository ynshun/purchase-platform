package com.softisland.domain.auth;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * Created by Administrator on 2016/9/2. 认证详情
 */

@Table(name = "business_auth_detail")
public class BusinessAuthDetail extends BaseEntity {
	private static final long serialVersionUID = -2868829557200545464L;

	// 主键id
	@Id
	@Column(name = "id")
	private Integer id;

	// 认证信息Id
	@Column(name = "auth_id")
	private Integer auth_id;

	// 信息类型 1：手持露脸-身份证件、护照或驾照 2：手持露脸-银行卡 3：Paypal明细图
	@Column(name = "type")
	private Integer type;

	// 客户/客服 1：客户 2：客服
	@Column(name = "user_type")
	private Integer user_type;

	// 文件Id
	@Column(name = "file_id")
	private Integer file_id;

	// 上传人名称
	@Column(name = "upload_name")
	private String upload_name;

	// 审核时间
	@Column(name = "review_time")
	private Date review_time;

	// 上传者的ip
	@Column(name = "ip")
	private String ip;

	// 审核者的id
	@Column(name = "review_id")
	private Integer review_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAuth_id() {
		return auth_id;
	}

	public void setAuth_id(Integer auth_id) {
		this.auth_id = auth_id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getUser_type() {
		return user_type;
	}

	public void setUser_type(Integer user_type) {
		this.user_type = user_type;
	}

	public Integer getFile_id() {
		return file_id;
	}

	public void setFile_id(Integer file_id) {
		this.file_id = file_id;
	}

	public String getUpload_name() {
		return upload_name;
	}

	public void setUpload_name(String upload_name) {
		this.upload_name = upload_name;
	}

	public Date getReview_time() {
		return review_time;
	}

	public void setReview_time(Date review_time) {
		this.review_time = review_time;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer getReview_id() {
		return review_id;
	}

	public void setReview_id(Integer review_id) {
		this.review_id = review_id;
	}

}
