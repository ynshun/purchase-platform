package com.softisland.log.appender;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.softisland.utils.http.HttpSender;
import com.softisland.utils.json.JsonParser;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;

public class PurchaseAppender extends AppenderBase<ILoggingEvent> {
	private static final ExecutorService threadPool = Executors.newFixedThreadPool(5);

	protected String url;

	protected String serviceId;

	@Override
	protected void append(ILoggingEvent eventObject) {
		Map<String, Object> datas = new HashMap<String, Object>();
		datas.put("serviceId", serviceId);
		datas.put("threadName", eventObject.getThreadName());
		datas.put("level", eventObject.getLevel().levelStr);
		datas.put("message", eventObject.getMessage());
		datas.put("loggerName", eventObject.getLoggerName());
		datas.put("timeStamp", eventObject.getTimeStamp());
		datas.put("MDCPropertyMap", eventObject.getMDCPropertyMap());
		datas.put("marker", eventObject.getMarker());
		datas.put("callerData", eventObject.getCallerData());
		datas.put("throwableProxy", eventObject.getThrowableProxy());
		datas.put("loggerContextVO", eventObject.getLoggerContextVO());
		datas.put("loggerName", eventObject.getLoggerName());
		datas.put("formattedMessage", eventObject.getFormattedMessage());

		final String content = JsonParser.beanToJson(datas);

		threadPool.submit(new Runnable() {
			@Override
			public void run() {
				HttpSender.post(url, content);
			}
		});
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
