
package app.dao;

import java.sql.SQLException;
import java.util.List;

public interface ProdutoInterface {
	public List<Produto> buscarTodosProdutos() throws SQLException;
}