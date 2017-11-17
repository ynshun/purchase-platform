package com.softisland.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softisland.result.BaseResult;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/order/")
public class BusinessOrderController {

	@ApiOperation(value = "记录并输出info级别日志", notes = "记录并输出info级别日志分别到文件和数据库")
	@ApiImplicitParam(name = "message", value = "消息详细信息", required = true, dataType = "String")
	@GetMapping("list")
	public BaseResult orderList() {
		
		return BaseResult.success();
	}

}
