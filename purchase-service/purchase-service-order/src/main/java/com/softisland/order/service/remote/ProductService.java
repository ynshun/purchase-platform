package com.softisland.order.service.remote;

import java.text.MessageFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.softisland.domain.product.Product;

@Service
public class ProductService {
	private final String ApplicationID = "PURCHASE-SERVICE-BASIC";
	private final String Protocol = "http://";

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "detailFallback")
	public Product detail(Integer p_id) {
		String url = MessageFormat.format("{0}{1}/product/detail/{2}", Protocol, ApplicationID, p_id + "");
		return restTemplate.getForEntity(url, Product.class).getBody();
	}

	public Product detailFallback(Integer p_id) {
		return detail(p_id);
	}
}