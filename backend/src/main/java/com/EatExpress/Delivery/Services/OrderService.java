package com.EatExpress.Delivery.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.EatExpress.Delivery.Dto.OrderDTO;
import com.EatExpress.Delivery.Entities.Order;
import com.EatExpress.Delivery.Repositories.OrderRepostory;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepostory repository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		List<Order> list = repository.findOrdersWithProducts();
		
		return list
				.stream()
				.map(x -> new OrderDTO(x))
				.collect(Collectors.toList());
	}
}
