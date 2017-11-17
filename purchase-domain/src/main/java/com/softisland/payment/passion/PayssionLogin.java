package com.softisland.payment.passion;

public class PayssionLogin {
	/*
	 * result_code 返回状态码 int 是 0表示成功，其他值都是错误 msg 信息说明 String 是
	 * 对result_code状态码的简短描述 data 响应数据 String 否 只有result_code为0时才有这个值
	 */
	private Integer result_code;
	private String msg;
	private String data;

	public Integer getResult_code() {
		return result_code;
	}

	public void setResult_code(Integer result_code) {
		this.result_code = result_code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
