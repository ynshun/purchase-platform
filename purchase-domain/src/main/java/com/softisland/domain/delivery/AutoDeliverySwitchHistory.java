package com.softisland.domain.delivery;

import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * 自动递送开关操作历史
 * 
 * @author 余能顺
 *
 */
@Table(name = "auto_delivery_switch_history")
public class AutoDeliverySwitchHistory extends BaseEntity {
	private static final long serialVersionUID = -3971835095908528366L;

	/**
	 * 开关类型（wechat-微信；alipay-支付宝）
	 */
	private String type;
	/**
	 * 修改前值
	 */
	private String before_value;
	/**
	 * 修改后值
	 */
	private String after_value;
	/**
	 * 说明
	 */
	private String descr;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBefore_value() {
		return before_value;
	}

	public void setBefore_value(String before_value) {
		this.before_value = before_value;
	}

	public String getAfter_value() {
		return after_value;
	}

	public void setAfter_value(String after_value) {
		this.after_value = after_value;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

}
