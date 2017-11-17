package com.softisland.basic.business.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softisland.base.BaseMapper;
import com.softisland.base.BaseService;
import com.softisland.basic.business.mapper.BusinessCurrencyMapper;
import com.softisland.domain.business.BusinessCurrency;

@Service
@Transactional
public class BusinessCurrencyService extends BaseService<BusinessCurrency> {
	@Resource
	private BusinessCurrencyMapper businessCurrencyMapper;

	/**
	 * @desc 获取站点支持的
	 * @author zhousg
	 * @date 2016年9月12日下午2:39:35
	 * @return
	 */
	public List<BusinessCurrency> getList(int site_id) {
		return null;
		// return businessCurrencyMapper.getList(site_id);
	}


	/**
	 * @desc 根据code获取名称
	 * @author zhousg
	 * @date 2016年10月9日下午3:06:16
	 * @param currencyCode
	 * @return
	 */
	public String getCurrencyName(String currencyCode) {
		return this.getCurrencyByCode(currencyCode).getCurrency_name();
	}

	/**
	 * @desc 根据code获取Icon
	 * @author zhousg
	 * @date 2016年10月9日下午3:06:16
	 * @param currencyCode
	 * @return
	 */
	public String getCurrencyIcon(String currencyCode) {
		return this.getCurrencyByCode(currencyCode).getCurrency_icon();
	}

	/**
	 * 根据货币代码查询货币对象
	 * 
	 * @Title getCurrencyByCode
	 * @param currencyCode
	 * @return
	 * @since 2017年7月17日 下午1:53:55
	 */
	public BusinessCurrency getCurrencyByCode(String currencyCode) {
		BusinessCurrency bCurrency = new BusinessCurrency();
		bCurrency.setCurrency_code(currencyCode);
		return businessCurrencyMapper.selectOne(bCurrency);
	}

	@Override
	protected BaseMapper<BusinessCurrency> getMapper() {
		return businessCurrencyMapper;
	}
}
