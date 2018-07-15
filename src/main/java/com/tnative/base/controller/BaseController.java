package com.tnative.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pagehelper.PageInfo;
import com.tnative.base.request.BasePage;
import com.tnative.base.service.BaseService;

import io.swagger.annotations.ApiOperation;

public abstract class BaseController<T, D extends BaseService<T>> {

	@Autowired
	protected D baseService;
	
	@ApiOperation("")
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public int insert(@RequestBody T entity) throws Exception {
		return baseService.insert(entity);
	}
	@ApiOperation("")
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public int update(@RequestBody T entity) throws Exception {
		return baseService.update(entity);
	}
	@ApiOperation("")
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public int delete(@RequestBody Integer entity) throws Exception {
		return baseService.delete(entity);
	}
	@ApiOperation("")
	@RequestMapping(value = "/select", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<T> select(@RequestBody T entity) {
		return baseService.select(entity);
	}
	@ApiOperation("")
	@RequestMapping(value = "/select-page", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public PageInfo<T> selectPage(@RequestBody BasePage<T> page) {
		return baseService.selectPage(page);
	}

}
