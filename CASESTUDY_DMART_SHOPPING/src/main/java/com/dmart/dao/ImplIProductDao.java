package com.dmart.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dmart.dbutil.DBUtil;
import com.dmart.entity.Product;

public class ImplIProductDao implements IProductDao{
	
	static List<Product> prdList = new ArrayList();  //as want same list for multiple adds or also wehve created obj of service globally

	private EntityManager em = DBUtil.getEntityManager();
	
	@Override
	public String addProduct(Product p) {
		
		
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		//em.close();
		
		return ("---Product Added---");
	}
	
	
	@Override
	public List<Product> getAllProducts() {
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@Override
	public String addProduct(Product p) {
		prdList.add(p);
		return ("---Product Added---");
		
	}

	@Override
	public List<Product> getAllProducts() {
		return prdList;
	}
	*/
	
	
	
	
}
