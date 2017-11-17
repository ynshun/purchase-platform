/**
 * @package: com.softisland.domain.business
 * @fileName: BusinessRefundReason.java
 */
package com.softisland.domain.business;

import javax.persistence.Column;
import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * 退款原因
 * 
 * @description:
 * @createdTime: 2016年10月17日 上午9:36:55
 * @createdUser: ynshun
 * @lastUpdatedTime:
 * @lastUpdatedUser:
 * @version: 1.0
 */

@Table(name = "business_refund_reason")
public class BusinessRefundReason extends BaseEntity {
	private static final long serialVersionUID = -3510331633060417017L;

	@Column(name = "title")
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
