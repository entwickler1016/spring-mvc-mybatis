package io.spring.temp.base;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BaseService<T>{

    @Transactional(readOnly = true)
    List<T> findAll();

    @Transactional(readOnly = true)
    T findById(int id);

    @Transactional
    void insert(T t);

    @Transactional
    void update(int id, T t);

    @Transactional
    void deleteById(int id);
}
