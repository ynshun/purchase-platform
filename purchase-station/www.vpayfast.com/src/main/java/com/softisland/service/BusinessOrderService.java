package com.softisland.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.softisland.result.BaseResult;
import com.softisland.service.fallback.BusinessOrderServiceFallback;

@FeignClient(value = "purchase-service-order", fallback = BusinessOrderServiceFallback.class)
public interface BusinessOrderService {

	@GetMapping("/order/list")
	public BaseResult list();
}