package com.softisland.basic.business.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softisland.base.BaseMapper;
import com.softisland.base.BaseService;
import com.softisland.basic.business.mapper.BusinessOrderExceptionMapper;
import com.softisland.domain.business.BusinessOrderException;

@Service
@Transactional
public class BusinessOrderExceptionService extends BaseService<BusinessOrderException> {
	private static Logger logger = LoggerFactory.getLogger(BusinessOrderExceptionService.class);

	@Autowired
	private BusinessOrderExceptionMapper businessOrderExceptionMapper;

	public int add(BusinessOrderException businessOrderException) throws Exception {
		BusinessOrderException check = new BusinessOrderException();
		check.setOrder_id(businessOrderException.getOrder_id());
		check.setPp_status(businessOrderException.getPp_status());
		check = businessOrderExceptionMapper.selectOne(check);
		if (null != check) {
			return 0;
		}
		return businessOrderExceptionMapper.insert(businessOrderException);
	}

	public int update(BusinessOrderException businessOrderException) throws Exception {
		BusinessOrderException check = new BusinessOrderException();
		check.setOrder_id(businessOrderException.getOrder_id());
		check = businessOrderExceptionMapper.selectOne(check);
		if (null != check) {
			logger.info("收到Paypal退款，Refunded：订单号：" + businessOrderException.getOrder_id() + ",已找到订单");
			check.setRemark(businessOrderException.getRemark());
			check.setPp_status(businessOrderException.getPp_status());
			check.setUpdate_id(0);
			check.setUpdate_time(new Date());
			check.setUpdate_name("系统管理员");
			return businessOrderExceptionMapper.updateByPrimaryKeySelective(check);
		} else {
			logger.info("收到Paypal退款，Refunded：订单号：" + businessOrderException.getOrder_id() + ",没找到订单");
			return 0;
		}
	}

	@Override
	public int selectCount(BusinessOrderException businessOrderException) {
		return businessOrderExceptionMapper.selectCount(businessOrderException);
	}

	@Override
	protected BaseMapper<BusinessOrderException> getMapper() {
		return businessOrderExceptionMapper;
	}

}
