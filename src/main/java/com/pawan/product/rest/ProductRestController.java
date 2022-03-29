package com.pawan.product.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pawan.product.model.Product;
import com.pawan.product.service.ProductService;

@RestController
public class ProductRestController {

	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	public List<Product> findAllProducts() {

		return productService.getAllProducts();
	}
}
