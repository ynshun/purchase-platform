package com.softisland.domain.fileCenter;

import javax.persistence.Column;
import javax.persistence.Table;

import com.softisland.domain.BaseEntity;

/**
 * 文件中心
 */
@Table(name = "file_center")
public class FileCenter extends BaseEntity {
	private static final long serialVersionUID = 299642031433783297L;

	@Column(name = "file_name")
	private String file_name;
	@Column(name = "file_type")
	private String file_type;
	@Column(name = "file_size")
	private Long file_size;
	@Column(name = "file_origin")
	private String file_origin;
	@Column(name = "file_url")
	private String file_url;
	@Column(name = "file_disk_addr")
	private String file_disk_addr;

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public String getFile_type() {
		return file_type;
	}

	public void setFile_type(String file_type) {
		this.file_type = file_type;
	}

	public Long getFile_size() {
		return file_size;
	}

	public void setFile_size(Long file_size) {
		this.file_size = file_size;
	}

	public String getFile_origin() {
		return file_origin;
	}

	public void setFile_origin(String file_origin) {
		this.file_origin = file_origin;
	}

	public String getFile_url() {
		return file_url;
	}

	public void setFile_url(String file_url) {
		this.file_url = file_url;
	}

	public String getFile_disk_addr() {
		return file_disk_addr;
	}

	public void setFile_disk_addr(String file_disk_addr) {
		this.file_disk_addr = file_disk_addr;
	}

}
