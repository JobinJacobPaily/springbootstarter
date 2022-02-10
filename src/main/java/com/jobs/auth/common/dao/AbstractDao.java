package com.jobs.auth.common.dao;

import com.jobs.auth.common.models.AbstractModel;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractDao<T extends AbstractModel> {

    T save(T object);
    void delete(T object);
}
