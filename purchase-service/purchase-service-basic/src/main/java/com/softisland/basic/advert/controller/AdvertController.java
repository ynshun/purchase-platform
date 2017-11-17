package com.softisland.basic.advert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.softisland.basic.advert.service.AdvertService;
import com.softisland.domain.advert.Advert;
import com.softisland.result.BaseResult;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;


/**
 * @description: 广告管理相关接口
 * @createdTime: 2017年11月13日 下午1:26:40
 * @createdUser: ynshun
 * @version: 1.0
 */
@RestController
@RequestMapping("/advert")
public class AdvertController {
	@Autowired
	private AdvertService advertService;

	
	@ApiOperation(value = "根据站点和类型ID查询广告列表", notes = "根据站点和类型ID查询广告列表")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "type_id", value = "广告类型id", required = true, dataType = "Integer"),
		@ApiImplicitParam(name = "site_id", value = "广告所属站点id", required = true, dataType = "Integer")
	})
	@RequestMapping(value = "list/{type_id}/{site_id}", method = RequestMethod.GET)
	public BaseResult loginPage(@PathVariable("type_id") Integer type_id, @PathVariable("site_id") Integer site_id) {
		try {
			Advert advert = new Advert();
			advert.setType_id(type_id);
			advert.setSite_id(site_id);
			List<Advert> list = advertService.select(advert);
			return BaseResult.success("查询广告列表成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return BaseResult.success("查询广告列表失败: " + e.getMessage());
		}
	}
}
