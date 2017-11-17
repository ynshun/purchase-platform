package com.softisland.domain.affiliate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * @desc 代理商信息
 * @author chenyu
 * @date 2016年11月7日上午10:15:35
 */
@Table(name = "affiliate_user")
public class AffiliateUser extends BaseEntity {
	private static final long serialVersionUID = -3412378042922723924L;

	@Id
	@Column(name = "id")
	private Integer id;

	/** 代理商名称 **/
	@Column(name = "name")
	private String name;

	/** 代理商归属 1、外部 2、内部 3、广告 **/
	@Column(name = "affi_ascription")
	private Integer affi_ascription;

	/** 代理商级别 **/
	@Column(name = "level")
	private Integer level;

	/** 提成比例 **/
	@Column(name = "comm_rate")
	private Double comm_rate;

	/** 代理商类型 1、订单代理 2、用户代理 **/
	@Column(name = "affi_type")
	private Integer affi_type;

	/** 注册时间 **/
	@Column(name = "insert_time")
	private Date insert_time;

	/** 提成类型 1、按销售额 2、按利润 **/
	@Column(name = "comm_type")
	private Integer comm_type;

	/** 密码 **/
	@Column(name = "password")
	private String password;

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

	public Integer getAffi_ascription() {
		return affi_ascription;
	}

	public void setAffi_ascription(Integer affi_ascription) {
		this.affi_ascription = affi_ascription;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Double getComm_rate() {
		return comm_rate;
	}

	public void setComm_rate(Double comm_rate) {
		this.comm_rate = comm_rate;
	}

	public Integer getAffi_type() {
		return affi_type;
	}

	public void setAffi_type(Integer affi_type) {
		this.affi_type = affi_type;
	}

	public Date getInsert_time() {
		return insert_time;
	}

	public void setInsert_time(Date insert_time) {
		this.insert_time = insert_time;
	}

	public Integer getComm_type() {
		return comm_type;
	}

	public void setComm_type(Integer comm_type) {
		this.comm_type = comm_type;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
