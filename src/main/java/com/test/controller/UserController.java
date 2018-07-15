package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.User;
import com.test.service.UserService;
import com.tnative.base.controller.BaseController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/user")
@Api
public class UserController extends BaseController<User, UserService> {

}
