package com.softisland.domain.business;

import java.io.Serializable;

import javax.persistence.*;

/**
 * @desc 国际化VO
 * @author chenyu
 * @date 2016年11月17日14:40:13
 */
@Table(name = "business_internation")
public class BusinessInternation implements Serializable {
	private static final long serialVersionUID = -7382168040772690547L;

	/** 主键ID **/
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** 资源id （产品服务id） **/
	@Column(name = "resource_id")
	private Integer resource_id;

	/** 资源类型 业务类型名称的国际化 charge_business_type_name **/
	@Column(name = "resource_type")
	private String resource_type;

	/**
	 * 语言id （ENGLISH(2,
	 * "英文"),PORTUGAL(3,"葡萄牙语"),GERMANY(4,"德语"),FRENCH(5,"法语"),RUSSIA(6,"俄语");
	 **/
	@Column(name = "language_id")
	private Integer language_id;

	/** 语言对应的内容 **/
	@Column(name = "content")
	private String content;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getResource_id() {
		return resource_id;
	}

	public void setResource_id(Integer resource_id) {
		this.resource_id = resource_id;
	}

	public String getResource_type() {
		return resource_type;
	}

	public void setResource_type(String resource_type) {
		this.resource_type = resource_type;
	}

	public Integer getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(Integer language_id) {
		this.language_id = language_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
