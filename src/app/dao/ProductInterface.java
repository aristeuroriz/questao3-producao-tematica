package app.dao;

import java.sql.SQLException;
import java.util.List;

public interface ProductInterface {
	 public List<Product> getAllProducts() throws SQLException;
}