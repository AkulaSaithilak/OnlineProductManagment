package com.controller;

import java.util.List;

import com.model.products;

import dao.AdminDao;
import dao.IAdminImp;

public class AdminController {
int result;
AdminDao dao=new IAdminImp();
public List<products> viewAllProducts(){
	return dao.viewAllProducts();
}
public int addProduct(int id,int price,String name,String type) {
	products pr = new products(id,price,name,type);
	return dao.addProduct(pr);
}
}
