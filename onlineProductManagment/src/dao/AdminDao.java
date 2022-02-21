package dao;

import java.util.List;

import com.model.products;

public interface AdminDao {

	public List<products> viewAllProducts();
	public int addProduct(products pr);
}
