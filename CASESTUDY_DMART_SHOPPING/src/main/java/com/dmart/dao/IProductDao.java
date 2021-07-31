package com.dmart.dao;

import java.util.List;

import com.dmart.entity.Product;

public interface IProductDao {
	
	public abstract String addProduct(Product p);
	public abstract List<Product> getAllProducts();


}
