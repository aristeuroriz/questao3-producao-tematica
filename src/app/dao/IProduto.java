package app.dao;

import java.sql.SQLException;
import java.util.List;

public interface IProduto {
	 public List<Produto> getAllProducts() throws SQLException;
}
