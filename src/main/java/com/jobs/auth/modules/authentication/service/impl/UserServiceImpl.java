package com.jobs.auth.modules.authentication.service.impl;

import com.jobs.auth.common.dao.UserDao;
import com.jobs.auth.common.models.User;
import com.jobs.auth.modules.authentication.model.RegisterRequest;
import com.jobs.auth.modules.authentication.model.RegisterResponse;
import com.jobs.auth.modules.authentication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public RegisterResponse register(RegisterRequest registerRequest) {
       try {
           User user = User.builder()
                   .userName(registerRequest.getUsername())
                   .password(registerRequest.getPassword())
                   .email(registerRequest.getEmail())
                   .build();
           User savedUser = userDao.save(user);

           return RegisterResponse.builder().userId(savedUser.getUserId()).build();
       } catch (Exception ex) {
           System.out.println(ex.getMessage());
           throw ex;
       }
    }


}
