package com.bk.service;

public interface BaseService<T> {

     T create(T entity);

     T getById(String id);
}
