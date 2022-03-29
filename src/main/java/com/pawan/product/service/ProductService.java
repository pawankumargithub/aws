package com.pawan.product.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pawan.product.model.Product;
  
@Service
public class ProductService {

	
	public List<Product> getAllProducts(){
		
		return Arrays.asList(new Product(34,"mobile",70000.0,4),
				new Product(288,"laptop",1009000.0,8),
				new Product(100,"AC",30000.0,10));
	}
}
