package com.softisland.basic.business.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softisland.base.BaseMapper;
import com.softisland.base.BaseService;
import com.softisland.basic.Constant;
import com.softisland.basic.business.mapper.BusinessDiscountMapper;
import com.softisland.domain.business.BusinessDiscount;
import com.softisland.result.BaseResult;

/**
 * @description: 黑名单管理
 *
 * @createdTime: 2017年11月13日 下午2:44:14
 * @createdUser: ynshun
 * @version: 1.0
 */
@Service
@Transactional
public class BusinessDiscountService extends BaseService<BusinessDiscount> {

	@Resource
	private BusinessDiscountMapper businessDiscountMapper;

	/**
	 * @desc 列表查询
	 * @author zhousg
	 * @date 2016年9月5日上午10:21:19
	 * @param businessDiscountVo
	 * @return
	 * @throws Exception
	 */
	public List<BusinessDiscount> queryListByPage(BusinessDiscount businessDiscount) {
		return businessDiscountMapper.select(businessDiscount);
	}

	/**
	 * @desc 新增
	 * @author zhousg
	 * @date 2016年9月5日下午2:07:47
	 * @param request
	 * @param businessDiscountVo
	 * @return
	 * @throws Exception
	 */
	public BaseResult add(Integer sysUserId, BusinessDiscount businessDiscount) {
		// 1.检查discount Code 是否已存在
		BusinessDiscount check = new BusinessDiscount();
		check.setDiscount_code(businessDiscount.getDiscount_code());
		check = businessDiscountMapper.selectOne(check);
		if (null != check) {
			return BaseResult.failure("该折扣码已存在");
		}
		// 2.存入
		businessDiscount.setStatus(Constant.TRUE);
		businessDiscount.setUsed_times(0);
		// businessDiscount.setCreate_id(sysUser.getId());
		// businessDiscount.setCreate_name(sysUser.getName());
		businessDiscount.setCreate_time(new Date());
		businessDiscountMapper.insertUseGeneratedKeys(businessDiscount);
		return new BaseResult();
	}

	/**
	 * @desc 修改
	 * @author zhousg
	 * @date 2016年9月6日下午4:28:16
	 * @param request
	 * @param businessDiscountVo
	 * @return
	 * @throws Exception
	 */
	public BaseResult update(BusinessDiscount businessDiscount) throws Exception {
		// 1.修改
		// businessDiscount.setUpdate_id(sysUser.getId());
		// businessDiscount.setUpdate_name(sysUser.getName());
		businessDiscount.setUpdate_time(new Date());
		businessDiscountMapper.updateByPrimaryKeySelective(businessDiscount);
		return BaseResult.success();
	}

	/**
	 * @desc 禁用/启用
	 * @author zhousg
	 * @date 2016年9月5日下午2:13:43
	 * @param request
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public BaseResult updateStatus(Integer id, Integer status) {
		BusinessDiscount discount = new BusinessDiscount();
		discount.setId(id);
		discount.setStatus(status);
		// discount.setUpdate_id(sysUser.getId());
		// discount.setUpdate_name(sysUser.getName());
		discount.setUpdate_time(new Date());
		businessDiscountMapper.updateByPrimaryKeySelective(discount);
		return new BaseResult();
	}

	public BaseResult getById(Integer id) {
		return BaseResult.success("Success", businessDiscountMapper.selectByPrimaryKey(id));
	}

	@Override
	protected BaseMapper<BusinessDiscount> getMapper() {
		return businessDiscountMapper;
	}
}
