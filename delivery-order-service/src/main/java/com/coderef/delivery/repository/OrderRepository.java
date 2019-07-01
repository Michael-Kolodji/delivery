package com.coderef.delivery.repository;

import org.springframework.data.repository.CrudRepository;

import com.coderef.delivery.model.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{

	Order findOne(Integer id);

}
