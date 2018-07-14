package com.tnative.base.dao;

import java.util.List;

import com.tnative.base.request.BasePage;


public interface BaseMapper<T> {
	//添加单个对象
	public int insert(T entity);
	
	//修改单个对象
	public int update(T entity);
	
	//删除单个对象 
	public int delete(T entity);
	
	//通过主键（数组）批量删除数据
	public int deleteList(String [] pks);
	
	//查询单个对象
	public T select(T entity);
	
	//通过关键字分页查询数据列表
	public List<T> selectPageList(BasePage<T> page);

}