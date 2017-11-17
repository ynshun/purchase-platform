package com.softisland.basic.business.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.softisland.base.BaseMapper;
import com.softisland.domain.business.BusinessPayCurrency;

public interface BusinessPayCurrencyMapper extends BaseMapper<BusinessPayCurrency> {

	public List<BusinessPayCurrency> selectPayCurrency(Integer businessPayId);

	public void deletePayCurrency(@Param("pay_id") Integer pay_id);
}
