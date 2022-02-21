package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.products;
import com.util.Db;
import com.util.Query;

public class IAdminImp implements AdminDao {
	PreparedStatement pst;
	ResultSet rs;
	int result;
	@Override
	public List<products> viewAllProducts() {

		List<products> list= new ArrayList<products>();
	try {
		pst = Db.getConnection().prepareStatement(Query.viewAll);
		rs = pst.executeQuery();
		while(rs.next()) {
			products info = new products(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4));
			list.add(info);
		}
	}catch(ClassNotFoundException | SQLException e) {
		System.out.println("Exception Occurs");
	}finally {
		try {
			Db.getConnection().close();
			pst.close();
			rs.close();
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception Occurs");
		}
	}
		return list;
	}

	@Override
	public int addProduct(products pr) {
		result =0;
		try{
			pst = Db.getConnection().prepareStatement(Query.addProduct);
			pst.setInt(1, pr.getId());
			pst.setInt(2, pr.getPrice());
			pst.setString(3, pr.getName());
			pst.setString(4, pr.getType());
			
			
			result = pst.executeUpdate();
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception Occurs at add product");
		}finally {
			try {
				Db.getConnection().close();
				pst.close();

			}catch(ClassNotFoundException | SQLException e) {
				System.out.println("Exception Occurs");
			}
		}
		
		return result;
	}

	
}
