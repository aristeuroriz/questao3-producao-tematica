package app;

import app.dao.ProductDAO;
import java.sql.SQLException;

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
