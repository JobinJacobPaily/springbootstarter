package com.jobs.auth.common.dao;

import com.jobs.auth.common.models.User;
import com.jobs.auth.common.models.UserLoginInfo;

public interface UserLoginInfoDao extends AbstractDao<UserLoginInfo> {


    UserLoginInfo getUserLoginInfo(Long userLoginId);
}
