package com.bk.controller;


public interface BaseController<T> {

     void create( T entity);

     T getById(String id);
}
