package com.jobs.auth.common.repository;

import com.jobs.auth.common.models.UserLoginInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginInfoRepository extends JpaRepository<UserLoginInfo, Long> {

    UserLoginInfo getByUserLoginId(Long userLoginId);
}
