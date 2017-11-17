package com.softisland.log.domain;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.Table;

import com.softisland.data.MapData;
import com.softisland.utils.http.IPUtils;

@Table(name = "other_logs")
public class OtherLog extends CatalinaLog {
	private static final long serialVersionUID = 7058816251531252650L;

	@SuppressWarnings("unchecked")
	public static OtherLog buildInstance(MapData logInfo) {
		OtherLog log = new OtherLog();
		
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
