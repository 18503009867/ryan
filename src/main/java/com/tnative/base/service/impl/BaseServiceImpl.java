package com.tnative.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tnative.base.dao.BaseMapper;
import com.tnative.base.request.BasePage;
import com.tnative.base.service.BaseService;

public abstract class BaseServiceImpl<T,D extends BaseMapper<T>> implements BaseService<T> {
	
	@Autowired
	protected D baseMapper;

	@Override
	public int insert(T entity) throws Exception {

		return baseMapper.insertSelective(entity);
	}

	@Override
	public int update(T entity) throws Exception {

		return baseMapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public int delete(Integer entity) throws Exception {

		return baseMapper.deleteByPrimaryKey(entity);
	}

	

	@Override
	public List<T> select(T entity) {
		List<T> list = baseMapper.selectAll(entity);
		return list;
	}

	@Override
	public PageInfo<T> selectPage(BasePage<T> page) {
		PageHelper.startPage(page.getPageNum(),page.getPageSize());
		return new PageInfo<>(baseMapper.selectAll(page.getT()));
	}

}