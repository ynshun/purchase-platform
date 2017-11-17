package com.softisland.domain.product;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.softisland.domain.BaseEntity;

/**
 * 定制服务
 * 
 * @Title CustomizedService.java
 * @Description TODO
 * @Company: 软岛
 * @author zg
 * @date 2017年10月16日 下午3:36:06
 * @version V1.0
 */

@Table(name = "customized_service")
public class CustomizedService extends BaseEntity {
	private static final long serialVersionUID = 6414379020313553473L;

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "user_id")
	private Integer user_id;

	@Column(name = "user_email")
	private String user_email;

	@Column(name = "site_id")
	private Integer site_id;

	@Column(name = "auth_code")
	private String auth_code;

	@Column(name = "demand_type")
	private String demand_type;

	@Column(name = "contact_way")
	private String contact_way;

	@Column(name = "contact_content")
	private String contact_content;

	@Column(name = "content")
	private String content;

	@Column(name = "is_read")
	private Integer is_read;

	@Column(name = "status")
	private Integer status;

	@Transient
	private String site_name;

	@Transient
	private String startTime;

	@Transient
	private String endTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public Integer getSite_id() {
		return site_id;
	}

	public void setSite_id(Integer site_id) {
		this.site_id = site_id;
	}

	public String getAuth_code() {
		return auth_code;
	}

	public void setAuth_code(String auth_code) {
		this.auth_code = auth_code;
	}

	public String getDemand_type() {
		return demand_type;
	}

	public void setDemand_type(String demand_type) {
		this.demand_type = demand_type;
	}

	public String getContact_way() {
		return contact_way;
	}

	public void setContact_way(String contact_way) {
		this.contact_way = contact_way;
	}

	public String getContact_content() {
		return contact_content;
	}

	public void setContact_content(String contact_content) {
		this.contact_content = contact_content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getIs_read() {
		return is_read;
	}

	public void setIs_read(Integer is_read) {
		this.is_read = is_read;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getSite_name() {
		return site_name;
	}

	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}
