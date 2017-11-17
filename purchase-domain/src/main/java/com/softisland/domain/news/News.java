package com.softisland.domain.news;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.softisland.domain.BaseEntity;

/**
 * 新闻 Created on 2016年10月21日
 * <p>
 * Copyright: Copyright (c) 2016
 * </p>
 * <p>
 * Company: 软岛
 * </p>
 * 
 * @author chenhaibo
 * @version 1.0
 */
@Table(name = "business_news")

public class News extends BaseEntity {
	private static final long serialVersionUID = -2792859853957641628L;

	// 新闻标题
	@Column(name = "title")
	private String title;

	// 关键词
	@Column(name = "key_word")
	private String key_word;

	// 内容简介
	@Column(name = "content_abstract")
	private String content_abstract;

	// 内容图片
	@Column(name = "file_id")
	private Integer file_id;

	// 新闻内容
	@Column(name = "content")
	private String content;

	// 新闻的编辑者
	@Column(name = "news_editor")
	private String news_editor;

	// 新闻类型id
	@Column(name = "type_id")
	private Integer type_id;

	// 站点id
	@Column(name = "site_id")
	private Integer site_id;

	// 语言版本
	@Column(name = "language")
	private Integer language;

	// 新闻发布时间
	@Column(name = "news_time")
	private Date news_time;

	@Transient
	private Integer notExistsId;

	@Transient
	private String fileUrl;

	@Transient
	private String type_name;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKey_word() {
		return key_word;
	}

	public void setKey_word(String key_word) {
		this.key_word = key_word;
	}

	public String getContent_abstract() {
		return content_abstract;
	}

	public void setContent_abstract(String content_abstract) {
		this.content_abstract = content_abstract;
	}

	public Integer getFile_id() {
		return file_id;
	}

	public void setFile_id(Integer file_id) {
		this.file_id = file_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getNews_editor() {
		return news_editor;
	}

	public void setNews_editor(String news_editor) {
		this.news_editor = news_editor;
	}

	public Integer getType_id() {
		return type_id;
	}

	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}

	public Integer getSite_id() {
		return site_id;
	}

	public void setSite_id(Integer site_id) {
		this.site_id = site_id;
	}

	public Integer getLanguage() {
		return language;
	}

	public void setLanguage(Integer language) {
		this.language = language;
	}

	public Date getNews_time() {
		return news_time;
	}

	public void setNews_time(Date news_time) {
		this.news_time = news_time;
	}

	public Integer getNotExistsId() {
		return notExistsId;
	}

	public void setNotExistsId(Integer notExistsId) {
		this.notExistsId = notExistsId;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

}
