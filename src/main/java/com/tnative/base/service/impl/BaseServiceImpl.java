package com.tnative.base.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tnative.base.dao.BaseMapper;
import com.tnative.base.request.BasePage;
import com.tnative.base.service.BaseService;

public abstract class BaseServiceImpl<T,D extends BaseMapper<T>> implements BaseService<T> {

	protected D baseMapper;

	protected abstract void setBaseMapper(D baseMapper);

	@Override
	public int insert(T entity) throws Exception {

		return baseMapper.insert(entity);
	}

	@Override
	public int update(T entity) throws Exception {

		return baseMapper.update(entity);
	}

	@Override
	public int delete(T entity) throws Exception {

		return baseMapper.delete(entity);
	}

	@Override
	public int deleteList(String[] pks) throws Exception {

		return baseMapper.deleteList(pks);
	}

	@Override
	public T select(T entity) {

		return baseMapper.select(entity);
	}

	@Override
	public PageInfo<T> selectPage(BasePage<T> page) {
		PageHelper.startPage(page.getPageNum(),page.getPageSize());
		return new PageInfo<>(baseMapper.selectPageList(page));
	}

}