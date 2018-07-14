package com.tnative.base.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pagehelper.PageInfo;
import com.tnative.base.request.BasePage;
import com.tnative.base.service.BaseService;

public abstract class BaseController<T> {

	private BaseService<T> baseService;

	public abstract void setBaseService(BaseService<T> baseService);

	// 添加单个对象
	@RequestMapping(value="/insert",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public int insert(T entity) throws Exception {
		return baseService.insert(entity);
	}

	// 修改单个对象
	@RequestMapping(value="/update",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public int update(T entity) throws Exception {
		return baseService.update(entity);
	}

	// 删除单个对象
	@RequestMapping(value="/delete",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public int delete(T entity) throws Exception {
		return baseService.delete(entity);
	}

	// 通过主键（数组）批量删除数据
	@RequestMapping(value="/delete-list",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public int deleteList(String[] pks) throws Exception {
		return baseService.deleteList(pks);
	}

	// 查询单个对象
	@RequestMapping(value="/select",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public T select(T entity) {
		return baseService.select(entity);
	}

	// 通过关键字分页查询
	@RequestMapping(value="/page-list",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public PageInfo<T> selectPage(BasePage<T> page) {
		return baseService.selectPage(page);
	}
}
