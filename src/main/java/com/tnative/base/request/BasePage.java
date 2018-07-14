package com.tnative.base.request;

import java.io.Serializable;

public class BasePage<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int pageNum;
    /**
     * 页面大小
     */
    private int pageSize;
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	private T t;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
    
}
