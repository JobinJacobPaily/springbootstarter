package com.jobs.auth.common.dao.impl;

import com.jobs.auth.common.dao.UserLoginInfoDao;
import com.jobs.auth.common.models.UserLoginInfo;
import com.jobs.auth.common.repository.UserLoginInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserLoginInfoImpl implements UserLoginInfoDao {

    @Autowired
    UserLoginInfoRepository userLoginInfoRepository;

    @Override
    public UserLoginInfo save(UserLoginInfo userLoginInfo) {
        return userLoginInfoRepository.save(userLoginInfo);
    }

    @Override
    public void delete(UserLoginInfo userLoginInfo) {
         userLoginInfoRepository.delete(userLoginInfo);
    }

    @Override
    public UserLoginInfo getUserLoginInfo(Long userLoginId) {
        return userLoginInfoRepository.getByUserLoginId(userLoginId);
    }
}
