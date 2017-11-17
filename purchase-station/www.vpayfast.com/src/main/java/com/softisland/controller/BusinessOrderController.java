package com.softisland.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.softisland.result.BaseResult;
import com.softisland.service.BusinessOrderService;

@Controller
@RequestMapping("/order/")
public class BusinessOrderController {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private BusinessOrderService businessOrderService;
	

	@RequestMapping("list")
	public @ResponseBody BaseResult list() {
		return restTemplate.getForEntity("http://purchase-service-order/order/list", BaseResult.class).getBody();
	}
	
	@RequestMapping("/feign/list")
	public @ResponseBody BaseResult feignList() {
		return businessOrderService.list();
	}

}
