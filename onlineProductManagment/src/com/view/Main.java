package com.view;

import java.util.List;
import java.util.Scanner;

import com.controller.AdminController;
import com.model.products;

public class Main {

	public static void main(String[] args) {
		AdminController controller= new AdminController();
		Scanner s= new Scanner(System.in);
		System.out.println("welcome to online Products!!");
		int count = 0;
		int result = 0;
		do {
			System.out.println("1 To Add Product & 2 To View Products");
			int option = s.nextInt();
			int id=0;
			int price=0;
			String name="";
			String type="";

			switch(option) {
			case 1:
				System.out.println("Enter Product Id");
				id=s.nextInt();
				System.out.println("Enter Product Price");
				price =s.nextInt();
				System.out.println("Enter Product Name");
				s.nextLine();

				name=s.nextLine();
				System.out.println("Enter Product Type");
				type=s.nextLine();
				
				result=controller.addProduct(id, price, name, type);
				if(result>0) {
					System.out.println("Product added sucess!!");
				}
				break;
			case 2:
				List<products> list =controller.viewAllProducts();
				if(list.size()>0) {
					System.out.println("id,price,name,type");
					for(products p : list) {
						System.out.println(p.getId()+" ,"+p.getPrice()+","+p.getName()+" ,"+p.getType());
					}
				}
				else {
					System.out.println("No records Found");
				}break;
				default:
					System.out.println("invalid Selection");
			}
			System.out.println("Press 1 to continue");
			count = s.nextInt();
			
		}while(count ==1);
		System.out.println("Done!!");
		s.close();
	}
}

