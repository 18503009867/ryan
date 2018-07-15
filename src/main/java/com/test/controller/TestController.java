package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Test;
import com.test.service.TestService;
import com.tnative.base.controller.BaseController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/test")
@Api
public class TestController  extends BaseController<Test, TestService>{
	
	

}
