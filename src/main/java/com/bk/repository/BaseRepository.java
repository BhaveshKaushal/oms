package com.bk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

// TODO: currently extending MongoRepository which will expose all the methods
// See https://docs.spring.io/spring-data/mongodb/docs/1.2.0.RELEASE/reference/html/repositories.html
@NoRepositoryBean
interface BaseRepository<T, ID extends Serializable> extends MongoRepository<T, ID> {
}
