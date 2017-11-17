package com.softisland.domain.business;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.softisland.domain.BaseEntity;
import com.softisland.domain.site.SitePay;

/**
 * @desc 支付方式
 * @author zoudong
 * @date 2016年9月5日上午9:26:16
 */
@Table(name = "business_pay")
public class BusinessPay extends BaseEntity {
	private static final long serialVersionUID = 3789784398718380901L;

	@Transient
	private Integer site_id;
	@Transient
	private String site_name;

	@Column(name = "pay_name")
	private String pay_name;

	@Column(name = "pay_image_url")
	private String pay_image_url;

	@Column(name = "pay_desc")
	private String pay_desc;

	@Column(name = "min_money")
	private Double min_money;

	@Column(name = "max_money")
	private Double max_money;

	@Column(name = "fee_money")
	private Double fee_money;

	@Column(name = "is_num_by")
	private Integer is_num_by;

	@Column(name = "pay_mode_code")
	private String pay_mode_code;

	@Column(name = "country")
	private String country;

	@Column(name = "jump_url")
	private String jump_url;

	// 前台查询时附加币种
	@Transient
	private String currency;

	@Transient
	private List<BusinessPayCurrency> businessPayCurrencies;

	@Transient
	private List<SitePay> sitePays;

	public Integer getSite_id() {
		return site_id;
	}

	public void setSite_id(Integer site_id) {
		this.site_id = site_id;
	}

	public String getSite_name() {
		return site_name;
	}

	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}

	public String getPay_name() {
		return pay_name;
	}

	public void setPay_name(String pay_name) {
		this.pay_name = pay_name;
	}

	public String getPay_image_url() {
		return pay_image_url;
	}

	public void setPay_image_url(String pay_image_url) {
		this.pay_image_url = pay_image_url;
	}

	public String getPay_desc() {
		return pay_desc;
	}

	public void setPay_desc(String pay_desc) {
		this.pay_desc = pay_desc;
	}

	public Double getMin_money() {
		return min_money;
	}

	public void setMin_money(Double min_money) {
		this.min_money = min_money;
	}

	public Double getMax_money() {
		return max_money;
	}

	public void setMax_money(Double max_money) {
		this.max_money = max_money;
	}

	public Double getFee_money() {
		return fee_money;
	}

	public void setFee_money(Double fee_money) {
		this.fee_money = fee_money;
	}

	public Integer getIs_num_by() {
		return is_num_by;
	}

	public void setIs_num_by(Integer is_num_by) {
		this.is_num_by = is_num_by;
	}

	public String getPay_mode_code() {
		return pay_mode_code;
	}

	public void setPay_mode_code(String pay_mode_code) {
		this.pay_mode_code = pay_mode_code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getJump_url() {
		return jump_url;
	}

	public void setJump_url(String jump_url) {
		this.jump_url = jump_url;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public List<BusinessPayCurrency> getBusinessPayCurrencies() {
		return businessPayCurrencies;
	}

	public void setBusinessPayCurrencies(List<BusinessPayCurrency> businessPayCurrencies) {
		this.businessPayCurrencies = businessPayCurrencies;
	}

	public List<SitePay> getSitePays() {
		return sitePays;
	}

	public void setSitePays(List<SitePay> sitePays) {
		this.sitePays = sitePays;
	}

}
