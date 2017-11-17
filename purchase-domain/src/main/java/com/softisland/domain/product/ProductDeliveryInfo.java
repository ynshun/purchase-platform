package com.softisland.domain.product;

import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * Created by Administrator on 2016/9/12.
 */

@Table(name = "product_delivery_info")
public class ProductDeliveryInfo extends BaseEntity {
	private static final long serialVersionUID = 880458582981534283L;
	private String name;// (递送信息名称)
	private String delivery_type;// (递送类型)1-文本框，2-下拉框，3-密码框，4-多行文本框
	private String default_content;// (默认内容)下拉框用逗号隔开
	private Integer status;// (状态)1,可用，2 不可用
	private String order_no;// (排序)
	private Integer p_id;// (产品ID) FK
	private Integer check_info;// (核对信息)
	private Integer use_type;// (用途类型)//1：账号 2：姓名 3：充值确认码 4：其他

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDelivery_type() {
		return delivery_type;
	}

	public void setDelivery_type(String delivery_type) {
		this.delivery_type = delivery_type;
	}

	public String getDefault_content() {
		return default_content;
	}

	public void setDefault_content(String default_content) {
		this.default_content = default_content;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public Integer getP_id() {
		return p_id;
	}

	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}

	public Integer getCheck_info() {
		return check_info;
	}

	public void setCheck_info(Integer check_info) {
		this.check_info = check_info;
	}

	public Integer getUse_type() {
		return use_type;
	}

	public void setUse_type(Integer use_type) {
		this.use_type = use_type;
	}

}
