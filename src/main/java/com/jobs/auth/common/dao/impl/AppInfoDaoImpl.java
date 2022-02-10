package com.jobs.auth.common.dao.impl;

import com.jobs.auth.common.dao.AppInfoDao;
import com.jobs.auth.common.models.AppInfo;
import com.jobs.auth.common.repository.AppInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AppInfoDaoImpl implements AppInfoDao {

    @Autowired
    private AppInfoRepository appInfoRepository;

    @Override
    public AppInfo getAppInfo(Long appId) {
        return appInfoRepository.getByAppId(appId);
    }

    @Override
    public AppInfo save(AppInfo appInfo) {
        return appInfoRepository.save(appInfo);
    }

    @Override
    public void delete(AppInfo appInfo) {
         appInfoRepository.delete(appInfo);
    }
}
