package com.javatutor.cassandra.repo;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.javatutor.cassandra.model.Product;

public interface ProductRepo extends CassandraRepository<Product, Integer> {

}
