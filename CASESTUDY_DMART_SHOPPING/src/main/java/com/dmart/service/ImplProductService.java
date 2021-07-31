package com.dmart.service;

import java.util.ArrayList;
import java.util.List;

import com.dmart.dao.IProductDao;
import com.dmart.dao.ImplIProductDao;
import com.dmart.entity.Product;

public class ImplProductService implements IProductService {
	
	IProductDao dao = new ImplIProductDao();

	
	
	
	@Override
	public String addProduct(Product p) {
		
		String msg = dao.addProduct(p);
		return msg;
	
	}

	@Override
	public List<Product> getAllProducts() {
		
		List<Product> prdList=dao.getAllProducts();
        return prdList;
	}

}
