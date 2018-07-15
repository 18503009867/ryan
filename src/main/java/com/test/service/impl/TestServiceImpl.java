package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.TestMapper;
import com.test.model.Test;
import com.test.service.TestService;
import com.tnative.base.service.impl.BaseServiceImpl;

@Service
public class TestServiceImpl extends BaseServiceImpl<Test, TestMapper> implements TestService {

}
