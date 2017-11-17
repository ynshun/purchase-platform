package com.softisland.domain.business;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * @desc 折扣码管理
 * @author zhousg
 * @date 2016年9月5日下午3:48:03
 */
@Table(name = "business_discount")
public class BusinessDiscount extends BaseEntity {
	private static final long serialVersionUID = -1105766201938556562L;

	/** 开始时间 **/
	@Column(name = "begin_time")
	private Date begin_time;
	/** 结束时间 **/
	@Column(name = "end_time")
	private Date end_time;
	/** 订单最小金额 **/
	@Column(name = "min_money")
	private Integer min_money;
	/** 订单最大金额 **/
	@Column(name = "max_money")
	private Integer max_money;
	/** 折扣码 **/
	@Column(name = "discount_code")
	private String discount_code;
	/** 折扣比例 1-100 */
	@Column(name = "discount_rate")
	private Integer discount_rate;
	/** 总次数 **/
	@Column(name = "total_times")
	private Integer total_times;
	/** 已使用次数 **/
	@Column(name = "used_times")
	private Integer used_times;
	/** 说明 **/
	@Column(name = "remark")
	private String remark;
	/** 站点Id **/
	@Column(name = "site_id")
	private String site_id;
	/** 规格Id **/
	@Column(name = "business_type_id")
	private Integer business_type_id;
	/** 是否限定产品 **/
	@Column(name = "is_limit_business")
	private Integer is_limit_business;

	public Date getBegin_time() {
		return begin_time;
	}

	public void setBegin_time(Date begin_time) {
		this.begin_time = begin_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public Integer getMin_money() {
		return min_money;
	}

	public void setMin_money(Integer min_money) {
		this.min_money = min_money;
	}

	public Integer getMax_money() {
		return max_money;
	}

	public void setMax_money(Integer max_money) {
		this.max_money = max_money;
	}

	public String getDiscount_code() {
		return discount_code;
	}

	public void setDiscount_code(String discount_code) {
		this.discount_code = discount_code;
	}

	public Integer getDiscount_rate() {
		return discount_rate;
	}

	public void setDiscount_rate(Integer discount_rate) {
		this.discount_rate = discount_rate;
	}

	public Integer getTotal_times() {
		return total_times;
	}

	public void setTotal_times(Integer total_times) {
		this.total_times = total_times;
	}

	public Integer getUsed_times() {
		return used_times;
	}

	public void setUsed_times(Integer used_times) {
		this.used_times = used_times;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSite_id() {
		return site_id;
	}

	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}

	public Integer getBusiness_type_id() {
		return business_type_id;
	}

	public void setBusiness_type_id(Integer business_type_id) {
		this.business_type_id = business_type_id;
	}

	public Integer getIs_limit_business() {
		return is_limit_business;
	}

	public void setIs_limit_business(Integer is_limit_business) {
		this.is_limit_business = is_limit_business;
	}

}
