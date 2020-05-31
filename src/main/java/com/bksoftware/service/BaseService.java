package com.bksoftware.service;

import java.util.List;

public interface BaseService<T> {

    public List<T> findAll();

    public T findById(int id);

    public T upload(T t);

    public T update(T t);

    public boolean delete(int id);

}
