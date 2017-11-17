package com.softisland.base;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

public abstract class BaseService<T> {

	protected abstract BaseMapper<T> getMapper();

	public T selectOne(T record) {
		return this.getMapper().selectOne(record);
	}

	public List<T> selectByRowBounds(T record, RowBounds rowBounds) {
		return this.getMapper().selectByRowBounds(record, rowBounds);
	}

	public int updateByPrimaryKey(T record) {
		return this.getMapper().updateByPrimaryKey(record);
	}

	public int updateByExample(T record, Object example) {
		return this.getMapper().updateByExample(record, example);
	}

	public int insertList(List<T> recordList) {
		return this.getMapper().insertList(recordList);
	}

	public int updateByPrimaryKeySelective(T record) {
		return this.getMapper().updateByPrimaryKeySelective(record);
	}

	public int insertSelective(T record) {
		return this.getMapper().insertSelective(record);
	}

	public int insert(T record) {
		return this.getMapper().insert(record);
	}

	public int insertUseGeneratedKeys(T record) {
		return this.getMapper().insertUseGeneratedKeys(record);
	}

	public List<T> selectByExample(Object example) {
		return this.getMapper().selectByExample(example);
	}

	public int selectCountByExample(Object example) {
		return this.getMapper().selectCountByExample(example);
	}

	public int delete(T record) {
		return this.getMapper().delete(record);
	}

	public List<T> selectByExampleAndRowBounds(Object example, RowBounds rowBounds) {
		return this.getMapper().selectByExampleAndRowBounds(example, rowBounds);
	}

	public List<T> selectAll() {
		return this.getMapper().selectAll();
	}

	public int selectCount(T record) {
		return this.getMapper().selectCount(record);
	}

	public int updateByExampleSelective(T record, Object example) {
		return this.getMapper().updateByExampleSelective(record, example);
	}

	public List<T> select(T record) {
		return this.getMapper().select(record);
	}

	public int deleteByExample(Object example) {
		return this.getMapper().deleteByExample(example);
	}

	public boolean existsWithPrimaryKey(Object key) {
		return this.getMapper().existsWithPrimaryKey(key);
	}

	public T selectByPrimaryKey(Object key) {
		return this.getMapper().selectByPrimaryKey(key);
	}

	public int deleteByPrimaryKey(Object key) {
		return this.getMapper().deleteByPrimaryKey(key);
	}

}
