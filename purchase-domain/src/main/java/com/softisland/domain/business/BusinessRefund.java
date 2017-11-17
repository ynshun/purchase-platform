package com.softisland.domain.business;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.softisland.domain.BaseEntity;

/**
 * 业务订单表
 */

@Table(name = "business_refund_record")
public class BusinessRefund extends BaseEntity {
	private static final long serialVersionUID = 7539780361865739420L;

	/** 订单号 **/
	@Column(name = "order_id")
	private Integer order_id;
	/** 退款原因ID **/
	@Column(name = "refund_reason_id")
	private Integer refund_reason_id;
	/** 退款审核说明 **/
	@Column(name = "audit_desc")
	private String audit_desc;

	/** 退款原因 **/
	@Transient
	private String refund_reason_title;

	/** 下单时间 **/
	@Transient
	private Date order_time;

	/** 购买人姓名 **/
	@Transient
	private String buyer_name;

	/** 购买人邮箱 **/
	@Transient
	private String buyer_email;

	/** 产品名称 **/
	@Transient
	private String p_name;

	/** 站点名称 **/
	@Transient
	private String site_name;

	/** 支付方式名称 **/
	@Transient
	private String pay_name;

	/** 结算总金额 **/
	@Transient
	private BigDecimal final_money;

	/** 转为美元的手续费 **/
	@Transient
	private BigDecimal fee_usd;

	/** 本站手续费(同结算币种) **/
	@Transient
	private BigDecimal this_fee;

	/** 美元净金额 **/
	@Transient
	private BigDecimal usd_net_amount;

	/** 净金额(同结算币种) **/
	@Transient
	private BigDecimal settle_net_amount;

	/** 结算币种符号 **/
	@Transient
	private String currency_icon;

	@Transient
	private String endTime;

	@Transient
	private String startTime;

	@Transient
	private Integer site_id;

	/** 批复状态 **/
	@Transient
	private String reply_status;

	@Transient
	private Integer total;
	@Transient
	private BigDecimal usdTotalAmount;
	@Transient
	private BigDecimal rmbTotalAmount;

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public Integer getRefund_reason_id() {
		return refund_reason_id;
	}

	public void setRefund_reason_id(Integer refund_reason_id) {
		this.refund_reason_id = refund_reason_id;
	}

	public String getAudit_desc() {
		return audit_desc;
	}

	public void setAudit_desc(String audit_desc) {
		this.audit_desc = audit_desc;
	}

	public String getRefund_reason_title() {
		return refund_reason_title;
	}

	public void setRefund_reason_title(String refund_reason_title) {
		this.refund_reason_title = refund_reason_title;
	}

	public Date getOrder_time() {
		return order_time;
	}

	public void setOrder_time(Date order_time) {
		this.order_time = order_time;
	}

	public String getBuyer_name() {
		return buyer_name;
	}

	public void setBuyer_name(String buyer_name) {
		this.buyer_name = buyer_name;
	}

	public String getBuyer_email() {
		return buyer_email;
	}

	public void setBuyer_email(String buyer_email) {
		this.buyer_email = buyer_email;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
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

	public BigDecimal getFinal_money() {
		return final_money;
	}

	public void setFinal_money(BigDecimal final_money) {
		this.final_money = final_money;
	}

	public BigDecimal getFee_usd() {
		return fee_usd;
	}

	public void setFee_usd(BigDecimal fee_usd) {
		this.fee_usd = fee_usd;
	}

	public BigDecimal getThis_fee() {
		return this_fee;
	}

	public void setThis_fee(BigDecimal this_fee) {
		this.this_fee = this_fee;
	}

	public BigDecimal getUsd_net_amount() {
		return usd_net_amount;
	}

	public void setUsd_net_amount(BigDecimal usd_net_amount) {
		this.usd_net_amount = usd_net_amount;
	}

	public BigDecimal getSettle_net_amount() {
		return settle_net_amount;
	}

	public void setSettle_net_amount(BigDecimal settle_net_amount) {
		this.settle_net_amount = settle_net_amount;
	}

	public String getCurrency_icon() {
		return currency_icon;
	}

	public void setCurrency_icon(String currency_icon) {
		this.currency_icon = currency_icon;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Integer getSite_id() {
		return site_id;
	}

	public void setSite_id(Integer site_id) {
		this.site_id = site_id;
	}

	public String getReply_status() {
		return reply_status;
	}

	public void setReply_status(String reply_status) {
		this.reply_status = reply_status;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public BigDecimal getUsdTotalAmount() {
		return usdTotalAmount;
	}

	public void setUsdTotalAmount(BigDecimal usdTotalAmount) {
		this.usdTotalAmount = usdTotalAmount;
	}

	public BigDecimal getRmbTotalAmount() {
		return rmbTotalAmount;
	}

	public void setRmbTotalAmount(BigDecimal rmbTotalAmount) {
		this.rmbTotalAmount = rmbTotalAmount;
	}

}
