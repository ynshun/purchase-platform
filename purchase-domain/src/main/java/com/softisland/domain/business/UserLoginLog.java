package com.softisland.domain.business;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @desc 用户登陆日志
 * @author zhousg
 * @date 2016年8月30日上午10:15:26
 */
@Table(name = "user_login_log")
public class UserLoginLog implements Serializable {
	private static final long serialVersionUID = -2904791232418724108L;

	@Id
	@Column(name = "id")
	private Integer id;
	/** 用户Id **/
	@Column(name = "user_id")
	private Integer user_id;
	/** 登陆时间 **/
	@Column(name = "login_time")
	private Date login_time;
	/** 登陆IP **/
	@Column(name = "login_ip")
	private String login_ip;
	/** 登陆站点 **/
	@Column(name = "login_site")
	private String login_site;

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

	public Date getLogin_time() {
		return login_time;
	}

	public void setLogin_time(Date login_time) {
		this.login_time = login_time;
	}

	public String getLogin_ip() {
		return login_ip;
	}

	public void setLogin_ip(String login_ip) {
		this.login_ip = login_ip;
	}

	public String getLogin_site() {
		return login_site;
	}

	public void setLogin_site(String login_site) {
		this.login_site = login_site;
	}

}
