package app.dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProdutoInterface {
	 public ArrayList<Produto> buscarTodosProdutos() throws SQLException;
}