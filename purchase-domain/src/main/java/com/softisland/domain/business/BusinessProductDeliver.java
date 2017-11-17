package com.softisland.domain.business;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @desc 用户-产品递送信息
 * @author zhousg
 * @date 2017年4月21日下午3:45:16
 */
@Table(name = "business_product_deliver")

public class BusinessProductDeliver implements Serializable {
	private static final long serialVersionUID = -7832190740683562852L;

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "user_id")
	private Integer user_id;

	@Column(name = "p_id")
	private Integer p_id;

	@Column(name = "is_default")
	private Integer is_default;

	@Column(name = "status")
	private Integer status;

	@Column(name = "operate_time")
	private Date operate_time;

	@Transient
	private List<BusinessProductDeliverDetail> detailList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getP_id() {
		return p_id;
	}

	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}

	public Integer getIs_default() {
		return is_default;
	}

	public void setIs_default(Integer is_default) {
		this.is_default = is_default;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getOperate_time() {
		return operate_time;
	}

	public void setOperate_time(Date operate_time) {
		this.operate_time = operate_time;
	}

	public List<BusinessProductDeliverDetail> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<BusinessProductDeliverDetail> detailList) {
		this.detailList = detailList;
	}

}
