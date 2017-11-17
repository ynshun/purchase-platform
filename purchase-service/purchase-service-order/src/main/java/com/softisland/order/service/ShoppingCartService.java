package com.softisland.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softisland.base.BaseMapper;
import com.softisland.base.BaseService;
import com.softisland.domain.business.BusinessShoppingCart;
import com.softisland.order.mapper.ShoppingCartMapper;

@Service
@Transactional
public class ShoppingCartService extends BaseService<BusinessShoppingCart> {
	@Autowired
	private ShoppingCartMapper shoppingCartMapper;

	@Override
	protected BaseMapper<BusinessShoppingCart> getMapper() {
		return shoppingCartMapper;
	}
}