package com.coderef.delivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.coderef.delivery.model.Order;
import com.coderef.delivery.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public Order save(@Validated Order order) {
		return orderRepository.save(order);
	}
	
	public Order findById(Integer id){
        return orderRepository.findOne(id);
    }

    public Iterable<Order> findAll(){
        return orderRepository.findAll();
    }

    public void delete(Integer id) {
        orderRepository.deleteById(id);
    }
    
}
