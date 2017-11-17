package com.softisland.domain.business;

import java.util.Date;

import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * Created by luoqb on 2016/9/6.
 */

@Table(name = "business_transaction")
public class BusinessTransaction extends BaseEntity {
	private static final long serialVersionUID = 6202124759091466883L;

	private String transaction_id;
	private Integer order_id;
	private String pay_type;
	private Integer pay_id;
	private Double amount_money;
	private Double bank_fee_money;
	private Double net_amount_money;
	private String payer_country;
	private String payer_name;
	private String payer_address;
	private String payer_postcode;
	private String payer_mobile;
	private String pay_status;
	private Date pay_time;
	private Date callback_time;
	private String paypal_email;
	private String paypal_receiver;
	private String currency_code;
	private Double net_amount_rmb;
	private Double usd_fee_money;
	private Integer sys_user_id;
	private String payment_id;
	private String remark;

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public String getPay_type() {
		return pay_type;
	}

	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}

	public Integer getPay_id() {
		return pay_id;
	}

	public void setPay_id(Integer pay_id) {
		this.pay_id = pay_id;
	}

	public Double getAmount_money() {
		return amount_money;
	}

	public void setAmount_money(Double amount_money) {
		this.amount_money = amount_money;
	}

	public Double getBank_fee_money() {
		return bank_fee_money;
	}

	public void setBank_fee_money(Double bank_fee_money) {
		this.bank_fee_money = bank_fee_money;
	}

	public Double getNet_amount_money() {
		return net_amount_money;
	}

	public void setNet_amount_money(Double net_amount_money) {
		this.net_amount_money = net_amount_money;
	}

	public String getPayer_country() {
		return payer_country;
	}

	public void setPayer_country(String payer_country) {
		this.payer_country = payer_country;
	}

	public String getPayer_name() {
		return payer_name;
	}

	public void setPayer_name(String payer_name) {
		this.payer_name = payer_name;
	}

	public String getPayer_address() {
		return payer_address;
	}

	public void setPayer_address(String payer_address) {
		this.payer_address = payer_address;
	}

	public String getPayer_postcode() {
		return payer_postcode;
	}

	public void setPayer_postcode(String payer_postcode) {
		this.payer_postcode = payer_postcode;
	}

	public String getPayer_mobile() {
		return payer_mobile;
	}

	public void setPayer_mobile(String payer_mobile) {
		this.payer_mobile = payer_mobile;
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

	public Date getCallback_time() {
		return callback_time;
	}

	public void setCallback_time(Date callback_time) {
		this.callback_time = callback_time;
	}

	public String getPaypal_email() {
		return paypal_email;
	}

	public void setPaypal_email(String paypal_email) {
		this.paypal_email = paypal_email;
	}

	public String getPaypal_receiver() {
		return paypal_receiver;
	}

	public void setPaypal_receiver(String paypal_receiver) {
		this.paypal_receiver = paypal_receiver;
	}

	public String getCurrency_code() {
		return currency_code;
	}

	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}

	public Double getNet_amount_rmb() {
		return net_amount_rmb;
	}

	public void setNet_amount_rmb(Double net_amount_rmb) {
		this.net_amount_rmb = net_amount_rmb;
	}

	public Double getUsd_fee_money() {
		return usd_fee_money;
	}

	public void setUsd_fee_money(Double usd_fee_money) {
		this.usd_fee_money = usd_fee_money;
	}

	public Integer getSys_user_id() {
		return sys_user_id;
	}

	public void setSys_user_id(Integer sys_user_id) {
		this.sys_user_id = sys_user_id;
	}

	public String getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(String payment_id) {
		this.payment_id = payment_id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
