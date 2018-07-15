package com.tnative.base.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.tnative.base.request.BasePage;

public interface BaseService<T> {

	public int insert(T entity) throws Exception;

	public int update(T entity) throws Exception;

	public int delete(Integer entity) throws Exception;

	public List<T> select(T entity);

	public PageInfo<T> selectPage(BasePage<T> page);

}
