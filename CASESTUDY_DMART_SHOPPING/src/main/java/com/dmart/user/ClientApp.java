package com.dmart.user;

import java.util.List;
import java.util.Scanner;

import com.dmart.entity.Product;
import com.dmart.service.ImplProductService;

public class ClientApp {
	
	public static void main(String[] args) {
		
		
//		Product p = new Product(101,"mobile",1000);
//		System.out.println(p);
		
		ImplProductService service = new ImplProductService();   //case me kiya to sab add attmpts ko naya obj banega alag list banegi isliye global crate kraa
		
		 Scanner sc= new Scanner(System.in);	 
		 String ans;
		 int no;
		do {
			System.out.println("***** DMART  Services ****");
			System.out.println("1. Enter Product Info ");	
			System.out.println("2. View Product -customer  ");			
			System.out.println("Pls enter your choice: ");
			no=sc.nextInt();			
					switch(no)
					{
					case 1: 
						System.out.println("Add Product Id, Product Name, Cost");
						System.out.println("--------------------------------------");
						int pId = sc.nextInt();
						String pNme = sc.next();
						double pCost = sc.nextDouble();
						
						Product p = new Product(pId, pNme, pCost);
						String str = service.addProduct(p);
						System.out.println(str);
						
						break;
					case 2: 
						System.out.println("Product List");
						System.out.println("---------------");
						
						List<Product> myList = service.getAllProducts();
						System.out.println(myList);
							
						break;							
					}	
					System.out.println("wish to continue? type y/n  ");
					ans = sc.next();
					}while(ans.equals("Y")||ans.equals("y"));							
					System.out.println("Thanks and visit again.");							
		}
	}


