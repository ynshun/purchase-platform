package com.softisland.order.service.remote;

import java.text.MessageFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.softisland.domain.product.ProductSpec;

@Service
public class ProductSpecService {
	private final String ApplicationID = "PURCHASE-SERVICE-BASIC";
	private final String Protocol = "http://";

	@Autowired
	private RestTemplate restTemplate;

	
	@HystrixCommand(fallbackMethod = "detailFallback")
	public ProductSpec detail(Integer spec_id) {
		String url = MessageFormat.format("{0}{1}/product/spec/detail/{2}", Protocol, ApplicationID, spec_id + "");
		return restTemplate.getForEntity(url, ProductSpec.class).getBody();
	}
	

	public ProductSpec detailFallback(Integer spec_id) {
		return detail(spec_id);
	}
}