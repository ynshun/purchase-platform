package com.softisland.domain.product;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * @desc 产品服务
 * @author chenyu
 * @date 2016年8月24日下午13:58:22
 */

@Table(name = "product_service")
public class Product extends BaseEntity {
	private static final long serialVersionUID = 2919959255258072390L;

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "p_number")
	private String p_number;

	@Column(name = "p_name")
	private String p_name;

	@Column(name = "second_type_id")
	private Integer second_type_id;

	@Column(name = "content")
	private String content;

	@Column(name = "p_image")
	private String p_image;

	@Column(name = "first_type_id")
	private Integer first_type_id;

	@Column(name = "is_c_service_id")
	private Integer is_c_service_id;

	@Column(name = "is_num_buy")
	private Integer is_num_buy;

	@Column(name = "reg_rate")
	private Double reg_rate;

	@Column(name = "spe_rate")
	private Double spe_rate;

	@Column(name = "p_content")
	private String p_content;

	@Column(name = "cost_price")
	private Double cost_price;

	@Column(name = "p_wap_image")
	private String p_wap_image;

	@Column(name = "is_custom_price")
	private Integer is_custom_price;

	@Column(name = "input_code")
	private String input_code;

	@Column(name = "p_subtitle")
	private String p_subtitle;

	// seo-标题
	@Column(name = "seo_title")
	private String seo_title;
	// seo-关键字
	@Column(name = "seo_keywords")
	private String seo_keywords;
	// seo-描述
	@Column(name = "seo_description")
	private String seo_description;
	// 人民币折扣率
	@Column(name = "rmb_rate")
	private Double rmb_rate;

	@Column(name = "ip_limit")
	private Integer ip_limit;

	// 支持的货币符号(目前该字段使用与vpayfast站的首页特殊需求)
	@Column(name = "currency")
	private String currency;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getP_number() {
		return p_number;
	}

	public void setP_number(String p_number) {
		this.p_number = p_number;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public Integer getSecond_type_id() {
		return second_type_id;
	}

	public void setSecond_type_id(Integer second_type_id) {
		this.second_type_id = second_type_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getP_image() {
		return p_image;
	}

	public void setP_image(String p_image) {
		this.p_image = p_image;
	}

	public Integer getFirst_type_id() {
		return first_type_id;
	}

	public void setFirst_type_id(Integer first_type_id) {
		this.first_type_id = first_type_id;
	}

	public Integer getIs_c_service_id() {
		return is_c_service_id;
	}

	public void setIs_c_service_id(Integer is_c_service_id) {
		this.is_c_service_id = is_c_service_id;
	}

	public Integer getIs_num_buy() {
		return is_num_buy;
	}

	public void setIs_num_buy(Integer is_num_buy) {
		this.is_num_buy = is_num_buy;
	}

	public Double getReg_rate() {
		return reg_rate;
	}

	public void setReg_rate(Double reg_rate) {
		this.reg_rate = reg_rate;
	}

	public Double getSpe_rate() {
		return spe_rate;
	}

	public void setSpe_rate(Double spe_rate) {
		this.spe_rate = spe_rate;
	}

	public String getP_content() {
		return p_content;
	}

	public void setP_content(String p_content) {
		this.p_content = p_content;
	}

	public Double getCost_price() {
		return cost_price;
	}

	public void setCost_price(Double cost_price) {
		this.cost_price = cost_price;
	}

	public String getP_wap_image() {
		return p_wap_image;
	}

	public void setP_wap_image(String p_wap_image) {
		this.p_wap_image = p_wap_image;
	}

	public Integer getIs_custom_price() {
		return is_custom_price;
	}

	public void setIs_custom_price(Integer is_custom_price) {
		this.is_custom_price = is_custom_price;
	}

	public String getInput_code() {
		return input_code;
	}

	public void setInput_code(String input_code) {
		this.input_code = input_code;
	}

	public String getP_subtitle() {
		return p_subtitle;
	}

	public void setP_subtitle(String p_subtitle) {
		this.p_subtitle = p_subtitle;
	}

	public String getSeo_title() {
		return seo_title;
	}

	public void setSeo_title(String seo_title) {
		this.seo_title = seo_title;
	}

	public String getSeo_keywords() {
		return seo_keywords;
	}

	public void setSeo_keywords(String seo_keywords) {
		this.seo_keywords = seo_keywords;
	}

	public String getSeo_description() {
		return seo_description;
	}

	public void setSeo_description(String seo_description) {
		this.seo_description = seo_description;
	}

	public Double getRmb_rate() {
		return rmb_rate;
	}

	public void setRmb_rate(Double rmb_rate) {
		this.rmb_rate = rmb_rate;
	}

	public Integer getIp_limit() {
		return ip_limit;
	}

	public void setIp_limit(Integer ip_limit) {
		this.ip_limit = ip_limit;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
