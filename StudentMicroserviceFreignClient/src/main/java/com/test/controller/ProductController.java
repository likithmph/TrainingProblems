package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.client.ProductClient;
import com.test.entity.Product;
@RestController
@RequestMapping("/product/v1/api")
public class ProductController {

	@Autowired
	private ProductClient client;
	
	@GetMapping("/list")
	public List<Product> listAllProducts(){
		return client.getAllProducts();
	}
}
