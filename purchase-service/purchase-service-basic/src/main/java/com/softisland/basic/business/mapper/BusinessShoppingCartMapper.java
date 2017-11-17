package com.softisland.basic.business.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.softisland.base.BaseMapper;
import com.softisland.domain.business.BusinessShoppingCart;

public interface BusinessShoppingCartMapper extends BaseMapper<BusinessShoppingCart> {

	public int disableBusinessShopCart(BusinessShoppingCart businessShopCart);

	public int getExistedProductIdInCart(BusinessShoppingCart businessShoppingCart);

	public int getProductSpecCountInCart(BusinessShoppingCart businessShoppingCart);

	public int isNewUser(BusinessShoppingCart businessShoppingCart);

	public int checkDiscountInBusinessType(
			@Param(value = "business_type_id") Integer business_type_id,
			@Param(value = "discount_business_type_id") Integer discount_business_type_id);

	public void updateShopcartStatus(
			@Param(value = "user_id") Integer user_id,
			@Param(value = "site_id") Integer site_id) throws Exception;

	public List<BusinessShoppingCart> selectByIds(@Param("ids") String[] ids);
}