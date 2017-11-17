package com.softisland.domain.business;

import java.util.Date;

import javax.persistence.Table;
import javax.persistence.Transient;

import com.softisland.domain.BaseEntity;

/**
 * 业务订单表
 */

@Table(name = "business_order")
public class BusinessOrder extends BaseEntity {
	private static final long serialVersionUID = 7539780361865739420L;

	private Integer p_id;
	private Integer site_id;
	private String source_name;
	private String country;
	private Integer pay_id;
	private String user_email;
	private String buyer_email;
	private String buyer_name;
	private Integer buyer_type;
	private String buyer_mobile;
	private String buyer_link_type;
	private String buyer_link_content;
	private String reply_status;
	private String deliver_status;
	private String pay_status;
	private Date pay_time;
	private String discount_code;
	private String trader_no;
	@Transient
	private String other_info;
	private String settle_currency;
	@Transient
	private Integer settle_currency_id;
	private Double settle_money;
	private Double this_fee;
	private Double final_money;
	private Double amount_money;
	private String bank_fee_currency;
	private Double bank_fee_money;
	private Double fee_usd;
	private Double usb_to_rmb_rate;
	private Double pay_to_usd_rate;
	private Double rmb_net_amount;
	private Double usd_net_amount;
	private Double cost_price;
	private Integer is_manaul;
	private Integer order_type;

	private Integer first_type_id;
	private Integer second_type_id;

	private String wx_picture_url;

	private String accept_language;

	private String user_agent;

	private String ip;

	private Integer user_id;

	private Integer refer_id;
	private Integer affiliate_id;
	// 针对Vpayfast
	private String language_version;

	@Transient
	private String site_name;
	@Transient
	private String p_name;
	@Transient
	private String pay_name;
	@Transient
	private String currency_icon;
	@Transient
	private String this_fee_usd;
	@Transient
	private String net_amount;
	@Transient
	private String manaulAdmin;
	@Transient
	private Date manaulTime;
	@Transient
	private String transactionRemark;
	@Transient
	private String transaction_id;
	@Transient
	private String aff_user_name;

	private String integrated_order;

	private String integrated_number;

	private String third_party_pay_name;

	/*** 打赏状态(0:未打赏,1:打赏成功,2:打赏失败) **/
	@Transient
	private int reward_status;

	public Integer getP_id() {
		return p_id;
	}

	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}

	public Integer getSite_id() {
		return site_id;
	}

	public void setSite_id(Integer site_id) {
		this.site_id = site_id;
	}

	public String getSource_name() {
		return source_name;
	}

	public void setSource_name(String source_name) {
		this.source_name = source_name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getPay_id() {
		return pay_id;
	}

	public void setPay_id(Integer pay_id) {
		this.pay_id = pay_id;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getBuyer_email() {
		return buyer_email;
	}

	public void setBuyer_email(String buyer_email) {
		this.buyer_email = buyer_email;
	}

	public String getBuyer_name() {
		return buyer_name;
	}

	public void setBuyer_name(String buyer_name) {
		this.buyer_name = buyer_name;
	}

	public Integer getBuyer_type() {
		return buyer_type;
	}

	public void setBuyer_type(Integer buyer_type) {
		this.buyer_type = buyer_type;
	}

	public String getBuyer_mobile() {
		return buyer_mobile;
	}

	public void setBuyer_mobile(String buyer_mobile) {
		this.buyer_mobile = buyer_mobile;
	}

	public String getBuyer_link_type() {
		return buyer_link_type;
	}

	public void setBuyer_link_type(String buyer_link_type) {
		this.buyer_link_type = buyer_link_type;
	}

	public String getBuyer_link_content() {
		return buyer_link_content;
	}

	public void setBuyer_link_content(String buyer_link_content) {
		this.buyer_link_content = buyer_link_content;
	}

	public String getReply_status() {
		return reply_status;
	}

	public void setReply_status(String reply_status) {
		this.reply_status = reply_status;
	}

	public String getDeliver_status() {
		return deliver_status;
	}

	public void setDeliver_status(String deliver_status) {
		this.deliver_status = deliver_status;
	}

	public String getPay_status() {
		return pay_status;
	}

	public void setPay_status(String pay_status) {
		this.pay_status = pay_status;
	}

	public Date getPay_time() {
		return pay_time;
	}

	public void setPay_time(Date pay_time) {
		this.pay_time = pay_time;
	}

	public String getDiscount_code() {
		return discount_code;
	}

	public void setDiscount_code(String discount_code) {
		this.discount_code = discount_code;
	}

	public String getTrader_no() {
		return trader_no;
	}

	public void setTrader_no(String trader_no) {
		this.trader_no = trader_no;
	}

	public String getOther_info() {
		return other_info;
	}

	public void setOther_info(String other_info) {
		this.other_info = other_info;
	}

	public String getSettle_currency() {
		return settle_currency;
	}

	public void setSettle_currency(String settle_currency) {
		this.settle_currency = settle_currency;
	}

	public Integer getSettle_currency_id() {
		return settle_currency_id;
	}

	public void setSettle_currency_id(Integer settle_currency_id) {
		this.settle_currency_id = settle_currency_id;
	}

	public Double getSettle_money() {
		return settle_money;
	}

	public void setSettle_money(Double settle_money) {
		this.settle_money = settle_money;
	}

	public Double getThis_fee() {
		return this_fee;
	}

	public void setThis_fee(Double this_fee) {
		this.this_fee = this_fee;
	}

	public Double getFinal_money() {
		return final_money;
	}

	public void setFinal_money(Double final_money) {
		this.final_money = final_money;
	}

	public Double getAmount_money() {
		return amount_money;
	}

	public void setAmount_money(Double amount_money) {
		this.amount_money = amount_money;
	}

	public String getBank_fee_currency() {
		return bank_fee_currency;
	}

	public void setBank_fee_currency(String bank_fee_currency) {
		this.bank_fee_currency = bank_fee_currency;
	}

	public Double getBank_fee_money() {
		return bank_fee_money;
	}

	public void setBank_fee_money(Double bank_fee_money) {
		this.bank_fee_money = bank_fee_money;
	}

	public Double getFee_usd() {
		return fee_usd;
	}

	public void setFee_usd(Double fee_usd) {
		this.fee_usd = fee_usd;
	}

	public Double getUsb_to_rmb_rate() {
		return usb_to_rmb_rate;
	}

	public void setUsb_to_rmb_rate(Double usb_to_rmb_rate) {
		this.usb_to_rmb_rate = usb_to_rmb_rate;
	}

	public Double getPay_to_usd_rate() {
		return pay_to_usd_rate;
	}

	public void setPay_to_usd_rate(Double pay_to_usd_rate) {
		this.pay_to_usd_rate = pay_to_usd_rate;
	}

	public Double getRmb_net_amount() {
		return rmb_net_amount;
	}

	public void setRmb_net_amount(Double rmb_net_amount) {
		this.rmb_net_amount = rmb_net_amount;
	}

	public Double getUsd_net_amount() {
		return usd_net_amount;
	}

	public void setUsd_net_amount(Double usd_net_amount) {
		this.usd_net_amount = usd_net_amount;
	}

	public Double getCost_price() {
		return cost_price;
	}

	public void setCost_price(Double cost_price) {
		this.cost_price = cost_price;
	}

	public Integer getIs_manaul() {
		return is_manaul;
	}

	public void setIs_manaul(Integer is_manaul) {
		this.is_manaul = is_manaul;
	}

	public Integer getOrder_type() {
		return order_type;
	}

	public void setOrder_type(Integer order_type) {
		this.order_type = order_type;
	}

	public Integer getFirst_type_id() {
		return first_type_id;
	}

	public void setFirst_type_id(Integer first_type_id) {
		this.first_type_id = first_type_id;
	}

	public Integer getSecond_type_id() {
		return second_type_id;
	}

	public void setSecond_type_id(Integer second_type_id) {
		this.second_type_id = second_type_id;
	}

	public String getWx_picture_url() {
		return wx_picture_url;
	}

	public void setWx_picture_url(String wx_picture_url) {
		this.wx_picture_url = wx_picture_url;
	}

	public String getAccept_language() {
		return accept_language;
	}

	public void setAccept_language(String accept_language) {
		this.accept_language = accept_language;
	}

	public String getUser_agent() {
		return user_agent;
	}

	public void setUser_agent(String user_agent) {
		this.user_agent = user_agent;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getRefer_id() {
		return refer_id;
	}

	public void setRefer_id(Integer refer_id) {
		this.refer_id = refer_id;
	}

	public Integer getAffiliate_id() {
		return affiliate_id;
	}

	public void setAffiliate_id(Integer affiliate_id) {
		this.affiliate_id = affiliate_id;
	}

	public String getLanguage_version() {
		return language_version;
	}

	public void setLanguage_version(String language_version) {
		this.language_version = language_version;
	}

	public String getSite_name() {
		return site_name;
	}

	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getPay_name() {
		return pay_name;
	}

	public void setPay_name(String pay_name) {
		this.pay_name = pay_name;
	}

	public String getCurrency_icon() {
		return currency_icon;
	}

	public void setCurrency_icon(String currency_icon) {
		this.currency_icon = currency_icon;
	}

	public String getThis_fee_usd() {
		return this_fee_usd;
	}

	public void setThis_fee_usd(String this_fee_usd) {
		this.this_fee_usd = this_fee_usd;
	}

	public String getNet_amount() {
		return net_amount;
	}

	public void setNet_amount(String net_amount) {
		this.net_amount = net_amount;
	}

	public String getManaulAdmin() {
		return manaulAdmin;
	}

	public void setManaulAdmin(String manaulAdmin) {
		this.manaulAdmin = manaulAdmin;
	}

	public Date getManaulTime() {
		return manaulTime;
	}

	public void setManaulTime(Date manaulTime) {
		this.manaulTime = manaulTime;
	}

	public String getTransactionRemark() {
		return transactionRemark;
	}

	public void setTransactionRemark(String transactionRemark) {
		this.transactionRemark = transactionRemark;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getAff_user_name() {
		return aff_user_name;
	}

	public void setAff_user_name(String aff_user_name) {
		this.aff_user_name = aff_user_name;
	}

	public String getIntegrated_order() {
		return integrated_order;
	}

	public void setIntegrated_order(String integrated_order) {
		this.integrated_order = integrated_order;
	}

	public String getIntegrated_number() {
		return integrated_number;
	}

	public void setIntegrated_number(String integrated_number) {
		this.integrated_number = integrated_number;
	}

	public String getThird_party_pay_name() {
		return third_party_pay_name;
	}

	public void setThird_party_pay_name(String third_party_pay_name) {
		this.third_party_pay_name = third_party_pay_name;
	}

	public int getReward_status() {
		return reward_status;
	}

	public void setReward_status(int reward_status) {
		this.reward_status = reward_status;
	}

}
