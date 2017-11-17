package com.softisland.basic.business.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.softisland.base.BaseMapper;
import com.softisland.domain.business.BusinessPay;

public interface BusinessPayMapper extends BaseMapper<BusinessPay> {

	public List<BusinessPay> queryBySiteIdAndCurrencyCode(
			@Param(value = "currency_code") String currency_code,
			@Param(value = "site_id") int site_id);

	public List<BusinessPay> queryBySiteIdAndCurrencyCodeForPayId(
			@Param(value = "currency_code") String currency_code, 
			@Param(value = "site_id") int site_id,
			@Param(value = "pay_id") Integer pay_id);
}
