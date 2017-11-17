package com.softisland.log.domain;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.Table;

import com.softisland.data.MapData;
import com.softisland.domain.BaseEntity;
import com.softisland.utils.http.IPUtils;

@Table(name = "catalina_logs")
public class CatalinaLog extends BaseEntity {
	private static final long serialVersionUID = -7049554356963661970L;

	/**
	 * 日志所属服务器
	 */
	private String from_host;

	/**
	 * 日志所属服务实例ID
	 */
	private String service_id;

	/**
	 * 日志生成时间
	 */
	private Date time_stamp;

	/**
	 * 格式化后的日志
	 */
	private String formatted_message;

	/**
	 * 日志等级
	 */
	private String level;

	/**
	 * 日志消息
	 */
	private String message;

	private String logger_name;

	private String thread_name;

	private String method_name;

	private String file_name;

	private Integer line_number;

	private String class_name;

	public String getFrom_host() {
		return from_host;
	}

	public void setFrom_host(String from_host) {
		this.from_host = from_host;
	}

	public String getService_id() {
		return service_id;
	}

	public void setService_id(String service_id) {
		this.service_id = service_id;
	}

	public Date getTime_stamp() {
		return time_stamp;
	}

	public void setTime_stamp(Date time_stamp) {
		this.time_stamp = time_stamp;
	}

	public String getFormatted_message() {
		return formatted_message;
	}

	public void setFormatted_message(String formatted_message) {
		this.formatted_message = formatted_message;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLogger_name() {
		return logger_name;
	}

	public void setLogger_name(String logger_name) {
		this.logger_name = logger_name;
	}

	public String getThread_name() {
		return thread_name;
	}

	public void setThread_name(String thread_name) {
		this.thread_name = thread_name;
	}

	public String getMethod_name() {
		return method_name;
	}

	public void setMethod_name(String method_name) {
		this.method_name = method_name;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public Integer getLine_number() {
		return line_number;
	}

	public void setLine_number(Integer line_number) {
		this.line_number = line_number;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	@SuppressWarnings("unchecked")
	public static CatalinaLog buildInstance(MapData logInfo) {
		CatalinaLog log = new CatalinaLog();
		
		log.setFrom_host(IPUtils.getIpAddress());
		log.setService_id(logInfo.get("serviceId", String.class));
		log.setTime_stamp(new Date(logInfo.get("timeStamp", Long.class)));
		log.setFormatted_message(logInfo.get("formattedMessage", String.class));
		log.setLevel(logInfo.get("level", String.class));
		log.setMessage(logInfo.get("message", String.class));
		log.setLogger_name(logInfo.get("loggerName", String.class));
		log.setThread_name(logInfo.get("threadName", String.class));

		List<Map<?, ?>> callerDatas = logInfo.get("callerData", List.class, true);
		boolean hasDataFlag = callerDatas != null && callerDatas.size() > 0;
		MapData callerData = hasDataFlag ? MapData.getInstance(callerDatas.get(0)) : null;

		log.setMethod_name(hasDataFlag ? callerData.get("methodName", String.class) : null);
		log.setFile_name(hasDataFlag ? callerData.get("fileName", String.class) : null);
		log.setLine_number(hasDataFlag ? callerData.get("lineNumber", Integer.class) : null);
		log.setClass_name(hasDataFlag ? callerData.get("className", String.class) : null);
		
		return log;
	}
	
}
