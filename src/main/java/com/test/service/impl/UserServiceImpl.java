package com.test.service.impl;

import org.springframework.stereotype.Service;

import com.test.dao.UserMapper;
import com.test.model.User;
import com.test.service.UserService;
import com.tnative.base.service.impl.BaseServiceImpl;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, UserMapper> implements UserService {

}
