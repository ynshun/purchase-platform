package com.softisland.log.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softisland.data.MapData;
import com.softisland.log.domain.CatalinaLog;
import com.softisland.log.domain.DebugLog;
import com.softisland.log.domain.ErrorLog;
import com.softisland.log.domain.InfoLog;
import com.softisland.log.domain.OtherLog;
import com.softisland.log.domain.WarnLog;
import com.softisland.log.service.CatalinaLogService;
import com.softisland.log.service.DebugLogService;
import com.softisland.log.service.ErrorLogService;
import com.softisland.log.service.InfoLogService;
import com.softisland.log.service.OtherLogService;
import com.softisland.log.service.WarnLogService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/log/")
public class LoggerController {
	@Autowired
	private CatalinaLogService catalinaLogService;
	@Autowired
	private DebugLogService debugLogService;
	@Autowired
	private ErrorLogService errorLogService;
	@Autowired
	private InfoLogService infoLogService;
	@Autowired
	private OtherLogService otherLogService;
	@Autowired
	private WarnLogService warnLogService;
	

	@PostMapping("append")
	@ApiOperation(value = "记录并输出日志", notes = "记录并输出日志分别到文件和数据库")
	@ApiImplicitParam(name = "logInfo", value = "消息详细信息", required = true, dataType = "MapData")
	public void info(@RequestBody MapData logInfo) {
		catalinaLogService.insert(CatalinaLog.buildInstance(logInfo));
		
		String level = logInfo.get("level", String.class);
		
		if (level.equalsIgnoreCase("info")) {
			infoLogService.insert(InfoLog.buildInstance(logInfo));
		} else if (level.equalsIgnoreCase("debug")) {
			debugLogService.insert(DebugLog.buildInstance(logInfo));
		} else if (level.equalsIgnoreCase("warn")) {
			warnLogService.insert(WarnLog.buildInstance(logInfo));
		} else if (level.equalsIgnoreCase("error")) {
			errorLogService.insert(ErrorLog.buildInstance(logInfo));
		} else {
			otherLogService.insert(OtherLog.buildInstance(logInfo));
		}
	}
}
