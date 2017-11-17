package com.softisland.payment.passion;

public class PayssionResult {
	/**
	 * itemNumber 订单号 String 是 请求支付时传入的订单号 pm_id 应用支付方式id String 是
	 * 请求支付时传入的应用支付方式id amount 订单金额 String 是 paid 已支付金额 String 是 currency 交易币种
	 * String 是 state 支付状态 String 是 sign 签名 String 是
	 * itemNumber+amount+currency+RETRUN_SIGN_KEY做MD5加密 transaction_id 交易号 net
	 * 手续费
	 **/
	// 订单号
	private String itemNumber;
	private String pm_id;
	private String amount;
	private String paid;
	private String currency;
	private String state;
	private String sign;
	private String transaction_id;
	private String net;

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getPm_id() {
		return pm_id;
	}

	public void setPm_id(String pm_id) {
		this.pm_id = pm_id;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPaid() {
		return paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getNet() {
		return net;
	}

	public void setNet(String net) {
		this.net = net;
	}

}
