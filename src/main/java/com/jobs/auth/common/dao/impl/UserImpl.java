package com.jobs.auth.common.dao.impl;

import com.jobs.auth.common.dao.UserDao;
import com.jobs.auth.common.models.User;
import com.jobs.auth.common.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserImpl implements UserDao {

    @Autowired
    UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public User GetUser(Long userId) {
        return userRepository.getByUserId(userId);
    }
}
