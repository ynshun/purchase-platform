package com.softisland.result;

import java.io.Serializable;

public class BaseResult implements Serializable {
	private static final long serialVersionUID = -5191629979706979074L;
	
	
	/**
     * 成功
     */
    public static final int CODE_OK = 200;
    /**
     * 业务成功默认消息
     */
    public static final String MSG_OK = "success";
    /**
     * 业务失败默认消息
     */
    public static final String MSG_FAIL = "fail";
    /**
     * 业务失败默认代码
     */
    public static final int CODE_FAIL = 999;
    /**
     * 无效用户
     */
    public static final int CODE_USER_INVALID = 201;
    /**
     * Steam用户校验失败
     */
    public static final int CODE_USER_VERIFICATION_FAILURE = 202;
    
    /**用户已存在**/
    public static final int CODE_USER_EXISTED = 203;
    
    /**邮箱格式不正确**/
    public static final int CODE_USER_EMAIL_INVALID = 204;
    
    /**密码不正确**/
    public static final int CODE_USER_PASSWORD_ERROR = 205;
    
    /**
     * 程序内部错误
     */
    public static final int CODE_INTERNAL_ERROR = 500;
    /**
     * 参数错误
     */
    public static final int CODE_PARAM_ERROR = 501;

    /**
     * The constant MSG_PARAM_ERROR.
     */
    public static final String MSG_PARAM_ERROR = "params error";

    /**
     * 参数重复
     */
    public static final int CODE_PARAM_ALREADY = 555;
    
    /**
     * 购物车中没有商品
     */
    public static final int CODE_SHOPPINGCART_EXECUTE_FAILED = 600;
    
    /**
     * 购物车中没有商品
     */
    public static final int CODE_SHOPPINGCART_EMPTY = 601;
    
    /**
     * 没能找到对应的商品可加入购物车
     */
    public static final int CODE_SHOPPINGCART_NONE_PRODUCT = 602;
    
    /**
     * 商品已失效
     */
    public static final int CODE_SHOPPINGCART_INVALID_PRODUCT = 603;
    
    /**
     * 没能找到对应规格的商品可加入购物车
     */
    public static final int CODE_SHOPPINGCART_NONE_PRODUCT_SPEC = 604;
    
    /**
     * 商品规格已失效
     */
    public static final int CODE_SHOPPINGCART_INVALID_PRODUCT_SPEC = 605;
    
    /**
     * 没能找到对应价格的商品可加入购物车
     */
    public static final int CODE_SHOPPINGCART_NONE_PRODUCT_PRICE = 606;
    
    /**
     * 商品价格已失效
     */
    public static final int CODE_SHOPPINGCART_INVALID_PRODUCT_PRICE = 607;
    
    /**
     * 本商品未设置成本商品价格已失效
     */
    public static final int CODE_SHOPPINGCART_INVALID_PRODUCT_COST_PRICE = 608;
    
    /**
     * 购物车中的商品类型不一致
     */
    public static final int CODE_SHOPPINGCART_INVALID_PRODUCT_TYPE = 609;
    
    /**
     * 未找到对应的支付方式
     */
    public static final int CODE_SHOPPINGCART_NONE_PAYMENT = 610;
    
    /**
     * 支付方式已失效
     */
    public static final int CODE_SHOPPINGCART_INVALID_PAYMENT = 611;
    
    /**
     * 未设置支付密码
     */
    public static final int CODE_SHOPPINGCART_NONE_PASSWORD = 612;
    
    /**
     * 支付密码错误
     */
    public static final int CODE_SHOPPINGCART_NONE_INVALID = 613;
    
    /**
     * 账户余额不足
     */
    public static final int CODE_SHOPPINGCART_BALANCE_INVALID = 614;
    
    /**
     * 订单创建失败
     */
    public static final int CODE_SHOPPINGCART_CREATE_ORDER_FAILED = 615;
    
    /**
     * 金额错误
     */
    public static final int CODE_SHOPPINGCART_AMOUNT_INVALID = 616;
    
    /**
     * 无效的币种
     */
    public static final int CODE_SHOPPINGCART_CURRENCY_INVALID = 617;

    /**
     * The constant MSG_PARAM_ALREADY.
     */
    public static final String MSG_PARAM_ALREADY = "params already error";
    public static final String MSG_USER_VERIFICATION_FAILURE="user_verification_failure";
	
	
	public static final String SUCCESS = "Success";
	public static final String FAILURE = "Failure";
	public static final String ERROR = "Error";
	
	public static final int SUCCESS_CODE = 200;
	public static final int FAILURE_CODE = 500;
	public static final int ERROR_CODE = 999;
	
	public static final String SUCCESS_MESSAGE = "操作成功";
	public static final String FAILURE_MESSAGE = "操作失败";
	public static final String ERROR_MESSAGE = "系统异常，请稍后再试";
	
	

	/**
	 * 返货结果状态 success: 成功 failure: 失败 error: 系统异常
	 */
	private String result_status;

	/**
	 * 返回结果码 200: 成功 500: 失败 999: 系统异常
	 */
	private int result_code;

	/**
	 * 返回结果消息
	 */
	private String result_message;

	/**
	 * 返回结果Data
	 */
	private Object data;
	
	
	public static BaseResult success() {
		return new BaseResult().setResult_code(SUCCESS_CODE).setResult_status(SUCCESS).setResult_message(SUCCESS_MESSAGE);
	}
	
	public static BaseResult success(String message) {
		return success().setResult_message(message);
	}
	
	public static BaseResult success(Object data) {
		return success().setData(data);
	}
	
	public static BaseResult success(String message, Object data) {
		return success().setResult_message(message).setData(data);
	}
	
	public static BaseResult failure(String message) {
		return new BaseResult().setResult_status(FAILURE).setResult_code(FAILURE_CODE).setResult_message(message);
	}
	
	public static BaseResult failure(int code, String message) {
		return failure(message).setResult_code(code);
	}
	
	public static BaseResult failure(String message, Object data) {
		return failure(message).setData(data);
	}
	
	public static BaseResult failure(int code, String message, Object data) {
		return failure(message).setResult_code(code).setData(data);
	}
	
	
	public static BaseResult error() {
		return new BaseResult().setResult_status(ERROR).setResult_code(ERROR_CODE).setResult_message(ERROR_MESSAGE);
	}
	

	public String getResult_status() {
		return result_status;
	}

	public BaseResult setResult_status(String result_status) {
		this.result_status = result_status;
		return this;
	}

	public int getResult_code() {
		return result_code;
	}

	public BaseResult setResult_code(int result_code) {
		this.result_code = result_code;
		return this;
	}

	public String getResult_message() {
		return result_message;
	}

	public BaseResult setResult_message(String result_message) {
		this.result_message = result_message;
		return this;
	}

	public Object getData() {
		return data;
	}

	public BaseResult setData(Object data) {
		this.data = data;
		return this;
	}

}
