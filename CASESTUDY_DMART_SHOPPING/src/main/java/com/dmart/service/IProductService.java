package com.dmart.service;

import java.util.List;

import com.dmart.entity.Product;

public interface IProductService {
	
	public abstract String addProduct(Product p);
	public abstract List<Product> getAllProducts();

}
