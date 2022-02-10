package com.jobs.auth.common.dao;

import com.jobs.auth.common.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends AbstractDao<User> {

    User GetUser(Long userId);
}
