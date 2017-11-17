package com.softisland.service.fallback;

import org.springframework.stereotype.Component;

import com.softisland.result.BaseResult;
import com.softisland.service.BusinessOrderService;

@Component
public class BusinessOrderServiceFallback implements BusinessOrderService {

	@Override
	public BaseResult list() {
		return BaseResult.error();
	}

}
