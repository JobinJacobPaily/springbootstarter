package com.jobs.auth.common.repository;

import com.jobs.auth.common.models.AppInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AppInfoRepository extends JpaRepository<AppInfo,Long> {

    AppInfo getByAppId(Long appId);
}
