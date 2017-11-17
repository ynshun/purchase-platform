package com.softisland.order.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.softisland.domain.business.BusinessShoppingCart;
import com.softisland.domain.product.Product;
import com.softisland.domain.product.ProductSpec;
import com.softisland.order.service.ShoppingCartService;
import com.softisland.order.service.remote.ProductService;
import com.softisland.order.service.remote.ProductSpecService;
import com.softisland.result.BaseResult;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/shoppingcart/")
public class ShoppingcartController {
	@Autowired
	private ShoppingCartService shoppingCartService;
	@Autowired
	private ProductService productService;
	@Autowired
	private ProductSpecService productSpecService;

	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	@ApiOperation(value = "添加指定商品到购物车", notes = "添加指定商品到购物车")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "user_id", value = "用户ID", required = true, paramType = "form", dataType = "int"),
			@ApiImplicitParam(name = "site_id", value = "所属站点ID", required = true, paramType = "form", dataType = "int"),
			@ApiImplicitParam(name = "p_id", value = "产品ID", required = true, paramType = "form", dataType = "int"),
			@ApiImplicitParam(name = "spec_id", value = "规格ID", required = true, paramType = "form", dataType = "int"),
			@ApiImplicitParam(name = "spec_name", value = "规格名称（规格ID（spec_id）为空时必填）", required = false, paramType = "form", dataType = "String"),
			@ApiImplicitParam(name = "spec_num", value = "规格数量（规格ID（spec_id）为空时必填）", required = false, paramType = "form", dataType = "Double"),
			@ApiImplicitParam(name = "currency_code", value = "当前币种", required = true, paramType = "form", dataType = "String"),
			@ApiImplicitParam(name = "number", value = "数量，默认1", required = false, paramType = "form", dataType = "int"),
			@ApiImplicitParam(name = "client_ip", value = "客户IP", required = true, paramType = "form", dataType = "String") })
	public BaseResult add(Integer user_id, Integer site_id, Integer p_id, Integer spec_id, Double spec_num, String spec_name, Integer number, String currency_code, String client_ip) {
		try {
			if (p_id == null) {
				return BaseResult.failure("参数错误：p_id不能为空");
			}
			
			if (spec_num == null && spec_id == null) {
				return BaseResult.failure("参数错误：spec_id不能为空");
			}
			
			Product product = productService.detail(p_id);
			if (product == null) {
				return BaseResult.failure("参数错误：错误的p_id");
			}
			
			ProductSpec productSpec = null;
			if (spec_id != null && spec_id > 0) {
				productSpec = productSpecService.detail(spec_id);
				if (productSpec == null) {
					return BaseResult.failure("参数错误：错误的spec_id");
				}
			}
			
			number = (number == null || number.intValue() <= 0) ? 1 : number;
			
			BusinessShoppingCart shoppingCart = new BusinessShoppingCart();
			shoppingCart.setUser_id(user_id);
			shoppingCart.setSite_id(site_id);
			shoppingCart.setP_id(p_id);
			shoppingCart.setSpec_id(spec_id);
			shoppingCart.setSale_amount(spec_num);
			shoppingCart.setStatus(1);
			
			shoppingCart = shoppingCartService.selectOne(shoppingCart);
			if (shoppingCart == null) {
				shoppingCart = new BusinessShoppingCart();
				shoppingCart.setUser_id(user_id);
				shoppingCart.setSite_id(site_id);
				shoppingCart.setP_id(p_id);
				shoppingCart.setP_name(product.getP_name());
				shoppingCart.setSpec_id(spec_id);
				shoppingCart.setSpec_name(productSpec == null ? spec_name : productSpec.getName());
				shoppingCart.setSale_amount(productSpec == null ? spec_num : productSpec.getSpec_num());
				shoppingCart.setSale_amount(spec_num);
				shoppingCart.setStatus(1);
				shoppingCart.setCreate_time(new Date());
				shoppingCart.setUpdate_time(new Date());
				shoppingCart.setCurrency_code(currency_code);
				shoppingCart.setNum(number);
				
				shoppingCart.setIp(client_ip);
				shoppingCart.setSale_price(15.21);
				shoppingCart.setOriginal_price(15.21);
				
				shoppingCartService.insert(shoppingCart);
			} else {
				shoppingCart.setUpdate_time(new Date());
				shoppingCart.setCurrency_code(currency_code);
				shoppingCart.setNum(shoppingCart.getNum() + number);
				
				shoppingCart.setIp(client_ip);
				shoppingCart.setSale_price(15.21);
				shoppingCart.setOriginal_price(15.21);
				
				shoppingCartService.updateByPrimaryKey(shoppingCart);
			}
			return BaseResult.success("添加购物车成功");
		} catch (Exception e) {
			e.printStackTrace();
			return BaseResult.failure(e.getMessage());
		}
	}

	@ApiOperation(value = "增加购物车中指定商品数量", notes = "增加购物车中指定商品数量")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "user_id", value = "用户ID", required = true, paramType = "form", dataType = "int"),
			@ApiImplicitParam(name = "site_id", value = "所属站点ID", required = true, paramType = "form", dataType = "int"),
			@ApiImplicitParam(name = "p_id", value = "产品ID", required = true, paramType = "form", dataType = "int"),
			@ApiImplicitParam(name = "spec_id", value = "规格ID", required = true, paramType = "form", dataType = "int"),
			@ApiImplicitParam(name = "number", value = "数量，默认1", required = false, paramType = "form", dataType = "int") })
	@GetMapping("increase")
	public BaseResult increase(Integer user_id, Integer site_id, Integer p_id, Integer spec_id, Integer number) {

		return BaseResult.success();
	}

	@GetMapping("reduce")
	@ApiOperation(value = "减少购物车中指定商品数量", notes = "减少购物车中指定商品数量")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "user_id", value = "用户ID", required = true, paramType = "form", dataType = "int"),
			@ApiImplicitParam(name = "site_id", value = "所属站点ID", required = true, paramType = "form", dataType = "int"),
			@ApiImplicitParam(name = "p_id", value = "产品ID", required = true, paramType = "form", dataType = "int"),
			@ApiImplicitParam(name = "spec_id", value = "规格ID", required = true, paramType = "form", dataType = "int"),
			@ApiImplicitParam(name = "number", value = "数量，默认1", required = false, paramType = "form", dataType = "int") })
	public BaseResult reduce(Integer user_id, Integer site_id, Integer p_id, Integer spec_id, Integer number) {

		return BaseResult.success();
	}

	@ApiOperation(value = "删除购物车中指定商品", notes = "删除购物车中指定商品")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "user_id", value = "用户ID", required = true, paramType = "form", dataType = "int"),
			@ApiImplicitParam(name = "site_id", value = "所属站点ID", required = true, paramType = "form", dataType = "int"),
			@ApiImplicitParam(name = "p_id", value = "产品ID", required = true, paramType = "form", dataType = "int"),
			@ApiImplicitParam(name = "spec_id", value = "规格ID", required = true, paramType = "form", dataType = "int") })
	@GetMapping("remove")
	public BaseResult remove(Integer user_id, Integer site_id, Integer p_id, Integer spec_id) {

		return BaseResult.success();
	}

	@GetMapping("clear")
	@ApiOperation(value = "清空购物车", notes = "清空购物车")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "user_id", value = "用户ID", required = true, paramType = "form", dataType = "int"),
			@ApiImplicitParam(name = "site_id", value = "所属站点ID", required = true, paramType = "form", dataType = "int") })
	public BaseResult clear(Integer user_id, Integer site_id) {

		return BaseResult.success();
	}

	@GetMapping("count")
	@ApiOperation(value = "统计购物车中商品数量", notes = "统计购物车中商品数量")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "user_id", value = "用户ID", required = true, paramType = "form", dataType = "int"),
			@ApiImplicitParam(name = "site_id", value = "所属站点ID", required = true, paramType = "form", dataType = "int") })
	public BaseResult count(Integer user_id, Integer site_id) {

		return BaseResult.success();
	}

}
