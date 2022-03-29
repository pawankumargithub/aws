package com.pawan.product.rest;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

		return productService.getAllProducts().stream().sorted(Comparator.comparing(Product::getPrice)).collect(Collectors.toList());
	}
}
