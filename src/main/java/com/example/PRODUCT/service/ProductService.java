package com.example.PRODUCT.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.PRODUCT.entity.Product;
import com.example.PRODUCT.exception.ProductNotFoundException;

public interface ProductService {
	public Product saveProduct(Product product);
	public List<Product> fetchAllProducts();
	public Product fetchProduct(Long id);
	public Product updateProduct(Long id, Product product);
	public String deleteProduct(Long id);
}
