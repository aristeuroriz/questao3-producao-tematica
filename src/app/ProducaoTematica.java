package app;

import java.sql.SQLException;

import app.DataAccessObject.ProductDAO;

public class ProducaoTematica {

	public static void main(String[] args) {
		
		ProductDAO productDAO = new ProductDAO();
		
		try {
			productDAO.getAllProducts();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
