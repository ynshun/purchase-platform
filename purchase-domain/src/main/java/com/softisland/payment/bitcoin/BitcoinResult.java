package com.softisland.payment.bitcoin;

public class BitcoinResult {
	// 订单号
	private String item_number;
	// 商品名称
	private String item_name;
	// 商品金额
	private String item_fee;
	// 第三方交易号
	private String txn_id;
	// 签名
	private String sign;
	// 支付币种
	private String currency;
	// 支付结果
	private String pay_result;

	public String getItem_number() {
		return item_number;
	}

	public void setItem_number(String item_number) {
		this.item_number = item_number;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getItem_fee() {
		return item_fee;
	}

	public void setItem_fee(String item_fee) {
		this.item_fee = item_fee;
	}

	public String getTxn_id() {
		return txn_id;
	}

	public void setTxn_id(String txn_id) {
		this.txn_id = txn_id;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPay_result() {
		return pay_result;
	}

	public void setPay_result(String pay_result) {
		this.pay_result = pay_result;
	}

}
