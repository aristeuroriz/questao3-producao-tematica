package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDAO implements ProdutoInterface {

	private Connection connection;

	public ProdutoDAO(Connection connection) {
		this.connection = connection;
	}

	public ArrayList<Produto> buscarTodosProdutos() throws SQLException {

		ArrayList<Produto> produtos = new ArrayList<Produto>();

		String sql = "SELECT * FROM PRODUTO LEFT JOIN ITEM_PRODUTO ON PRODUTO.CODIGOPRODUTO = ITEM_PRODUTO.CODIGOPRODUTO;";

		try (PreparedStatement pstm = connection.prepareStatement(sql)) {
			pstm.execute();
			parseResultSetToProduct(produtos, pstm);
		}
		return produtos;

	}

	private void parseResultSetToProduct(ArrayList<Produto> produtos, PreparedStatement pstm) throws SQLException {
		try (ResultSet resultSet = pstm.getResultSet()) {
			while (resultSet.next()) {

//				Produto produto = new Produto(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
//						resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7),
//						resultSet.getString(8), parseResultSetToProduct(resultSet));
//				produtos.add(produto);
			}
		}
	}

	private ItemProduto parseResultSetToProduct(ResultSet resultSet) throws SQLException {
		ItemProduto item = new ItemProduto(resultSet.getInt(9), resultSet.getInt(10), resultSet.getString(11),
				resultSet.getString(12), resultSet.getString(13), resultSet.getString(14), resultSet.getString(15),
				resultSet.getString(16), resultSet.getString(17));
		return item;
	}

}
