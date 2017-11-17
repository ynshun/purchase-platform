package com.softisland.domain.business;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.softisland.domain.BaseEntity;

/**
 * @desc 用户信息
 * @author zhousg
 * @date 2016年8月30日上午10:15:35
 */
@Table(name = "user_info")

public class UserInfo extends BaseEntity {
	private static final long serialVersionUID = -5486160484694807156L;

	@Id
	@Column(name = "id")
	private Integer id;
	/** 状态 状态 1,可用，2，禁用，99删除 **/
	@Column(name = "status")
	private Integer status;
	/** 登陆邮箱 **/
	@Column(name = "email")
	private String email;
	/** 登陆邮箱 **/
	@Column(name = "name")
	private String name;
	/** 密码 **/
	@Column(name = "pwd")
	private String pwd;
	/** 注册时登陆的站点 **/
	@Column(name = "login_site")
	private String login_site;
	/** 出生年份 **/
	@Column(name = "birth_year")
	private Integer birth_year;
	/** 出生月份 **/
	@Column(name = "birth_month")
	private Integer birth_month;
	/** 出生日期 **/
	@Column(name = "birth_day")
	private Integer birth_day;
	/** 性别 1：男 0：女 **/
	@Column(name = "gender")
	private Integer gender;
	/** 手机 **/
	@Column(name = "mobile")
	private String mobile;
	/** 联系方式类型 **/
	@Column(name = "link_type")
	private String link_type;
	/** 具体联系方式 **/
	@Column(name = "link_content")
	private String link_content;
	/** 创建时间 **/
	@Column(name = "create_time")
	private Date create_time;
	/** 修改时间 **/
	@Column(name = "update_time")
	private Date update_time;

	/** 所属代理商id **/
	@Column(name = "affi_id")
	private Integer affi_id;

	/** 最后一次登陆时间 **/
	@Column(name = "lastLoginTime")
	private Date lastLoginTime;

	/** 明文密码 用于用户中心合并数据 **/
	@Column(name = "express_word")
	private String express_word;
	/** 用户中心的唯一用户标识 **/
	@Column(name = "user_center_code")
	private String user_center_code;
	/** 注册开始时间（查询时使用） **/
	@Transient
	private String startTime;

	/** 注册开始时间（查询时使用） **/
	@Transient
	private String endTime;
	/** 用户钱包余额 **/
	@Transient
	private BigDecimal balance;
	/** 用户待认证金额 **/
	@Transient
	private BigDecimal certify_money;
	/*** 登录站点的名称 **/
	@Transient
	private String login_site_name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getLogin_site() {
		return login_site;
	}

	public void setLogin_site(String login_site) {
		this.login_site = login_site;
	}

	public Integer getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(Integer birth_year) {
		this.birth_year = birth_year;
	}

	public Integer getBirth_month() {
		return birth_month;
	}

	public void setBirth_month(Integer birth_month) {
		this.birth_month = birth_month;
	}

	public Integer getBirth_day() {
		return birth_day;
	}

	public void setBirth_day(Integer birth_day) {
		this.birth_day = birth_day;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getLink_type() {
		return link_type;
	}

	public void setLink_type(String link_type) {
		this.link_type = link_type;
	}

	public String getLink_content() {
		return link_content;
	}

	public void setLink_content(String link_content) {
		this.link_content = link_content;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public Integer getAffi_id() {
		return affi_id;
	}

	public void setAffi_id(Integer affi_id) {
		this.affi_id = affi_id;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getExpress_word() {
		return express_word;
	}

	public void setExpress_word(String express_word) {
		this.express_word = express_word;
	}

	public String getUser_center_code() {
		return user_center_code;
	}

	public void setUser_center_code(String user_center_code) {
		this.user_center_code = user_center_code;
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

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getCertify_money() {
		return certify_money;
	}

	public void setCertify_money(BigDecimal certify_money) {
		this.certify_money = certify_money;
	}

	public String getLogin_site_name() {
		return login_site_name;
	}

	public void setLogin_site_name(String login_site_name) {
		this.login_site_name = login_site_name;
	}

}
