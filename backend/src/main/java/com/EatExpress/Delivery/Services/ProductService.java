package com.EatExpress.Delivery.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.EatExpress.Delivery.Dto.ProductDTO;
import com.EatExpress.Delivery.Entities.Product;
import com.EatExpress.Delivery.Repositories.ProductRepostory;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepostory repository;
	
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll(){
		List<Product> list = repository.findAllByOrderByNameAsc();
		
		return list
				.stream()
				.map(x -> new ProductDTO(x))
				.collect(Collectors.toList());
	}
}
