package com.dmart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTS")
public class Product {
	
	@Id
	@Column(name="PRODUCT_ID")
	private int prdId=0;
	
	@Column(name="PRODUCT_NAME")
	private String prdName="";
	
	@Column(name="PRODUCT_COST")
	private double prdCost=0;
	
	public Product() {
		super();
	}

	public Product(int prdId, String prdName, double prdCost) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCost = prdCost;
	}

	public int getPrdId() {
		return prdId;
	}

	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public double getPrdCost() {
		return prdCost;
	}

	public void setPrdCost(double prdCost) {
		this.prdCost = prdCost;
	}

	@Override
	public String toString() {
		return "\n Product [prdId=" + prdId + ", prdName=" + prdName + ", prdCost=" + prdCost + "]";
	}
	
	
	
	
	

}
