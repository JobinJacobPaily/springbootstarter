package com.jobs.auth.common.dao;

import com.jobs.auth.common.models.AppInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface AppInfoDao extends AbstractDao<AppInfo> {

    AppInfo getAppInfo(Long appId);


}
