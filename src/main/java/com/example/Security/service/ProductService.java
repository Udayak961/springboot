package com.example.Security.service;

import java.beans.JavaBean;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.Security.entity.Product;
import com.example.Security.exception.ProductNotFoundException;
import com.example.Security.repository.ProductRepository;

@Component

public interface ProductService {
	
	public Product saveProduct(Product product);
	public List<Product> fetchAllProducts();
	public Product fetchProduct(Long id) throws ProductNotFoundException;
	public Product putUpdateProduct(Long id, Product product) throws ProductNotFoundException;
	public Product patchUpdateProduct(Long id, Map<String, Object> productMap)throws ProductNotFoundException;
	public String deleteProduct(Long id);
}