package com.mingjiang.BaseService;

import java.util.List;

/**
 * Created by Administrator on 2016/12/28.
 */
public interface BaseService<T> {
    void save(T entity);

    void delete(long id);

    void update(T entity);

    T getById(long id);

    List<T> getByIds(long[] ids);

    List<T> findAll();
}
