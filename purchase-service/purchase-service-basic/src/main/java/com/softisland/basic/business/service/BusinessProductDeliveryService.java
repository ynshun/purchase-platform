package com.softisland.basic.business.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softisland.base.BaseMapper;
import com.softisland.base.BaseService;
import com.softisland.basic.business.mapper.BusinessProductDeliverDetailMapper;
import com.softisland.basic.business.mapper.BusinessProductDeliverMapper;
import com.softisland.domain.business.BusinessProductDeliver;
import com.softisland.domain.business.BusinessProductDeliverDetail;

import net.sf.json.JSONArray;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
@Transactional
public class BusinessProductDeliveryService extends BaseService<BusinessProductDeliver> {

	@Resource
	private BusinessProductDeliverMapper businessProductDeliverMapper;

	@Resource
	private BusinessProductDeliverDetailMapper businessProductDeliverDetailMapper;

	/**
	 * @desc 根据用户ID 产品ID 获取递送信息
	 * @author zhousg
	 * @date 2017年4月24日下午2:15:51
	 * @param user_id
	 *            用户ID
	 * @param p_id
	 *            产品ID
	 * @return
	 * @throws Exception
	 */
	public List<BusinessProductDeliver> getProductDeliverLists(Integer user_id, Integer p_id) throws Exception {
		List<BusinessProductDeliver> list = businessProductDeliverMapper.getList(user_id, p_id);
		if (null != list && list.size() > 0) {
			for (BusinessProductDeliver productDeliver : list) {
				List<BusinessProductDeliverDetail> detailList = businessProductDeliverDetailMapper.queryDetail(productDeliver.getId());
				if (null != detailList && detailList.size() > 0) {
					productDeliver.setDetailList(detailList);
				}
			}
		}
		return list;
	}

	/**
	 * @desc 保存递送信息
	 * @author zhousg
	 * @date 2017年4月24日下午5:23:01
	 * @param user_id
	 * @param p_id
	 * @param detailList
	 */
	public void saveProductDeliver(Integer user_id, Integer p_id, JSONArray detailArray, Integer updateProductDeliverId) throws Exception {

	}

	/**
	 * @desc 逻辑删除递送信息
	 * @author zhousg
	 * @date 2017年4月24日下午5:23:01
	 * @param user_id
	 * @param p_id
	 * @param detailList
	 */
	public void deleteProductDeliver(Integer id) throws Exception {
		BusinessProductDeliver deliver = new BusinessProductDeliver();
		deliver.setId(id);
		deliver.setStatus(-1);
		businessProductDeliverMapper.updateByPrimaryKeySelective(deliver);
	}

	/**
	 * @desc 设置默认递送信息
	 * @author zhousg
	 * @date 2017年4月24日下午5:23:01
	 * @param user_id
	 * @param p_id
	 * @param detailList
	 */
	public void setProductDeliverDefault(Integer id, Integer user_id, Integer p_id) throws Exception {
		// 1.一般这种，我们将这条信息设置为默认，其他的设置为非默认
		Example example = new Example(BusinessProductDeliver.class);
		Criteria criteria = example.createCriteria();
		criteria.andEqualTo("p_id", p_id);
		criteria.andEqualTo("user_id", user_id);
		BusinessProductDeliver updateDeliver = new BusinessProductDeliver();
		updateDeliver.setIs_default(0);
		businessProductDeliverMapper.updateByExampleSelective(updateDeliver, example);
		// 2.设置默认
		BusinessProductDeliver deliver = new BusinessProductDeliver();
		deliver.setId(id);
		deliver.setIs_default(1);
		businessProductDeliverMapper.updateByPrimaryKeySelective(deliver);
	}

	@Override
	protected BaseMapper<BusinessProductDeliver> getMapper() {
		return businessProductDeliverMapper;
	}
}
