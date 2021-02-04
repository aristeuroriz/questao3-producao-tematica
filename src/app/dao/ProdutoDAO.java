package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements IProduto {

	private Connection connection;

	public ProdutoDAO(Connection connection) {
		this.connection = connection;
	}

	public List<Produto> getAllProducts() throws SQLException {

		List<Produto> produtos = new ArrayList<Produto>();

		String sql = "SELECT * FROM PRODUTO;";

		try (PreparedStatement pstm = connection.prepareStatement(sql)) {
			pstm.execute();

			parseResultSetToProduct(produtos, pstm);
		}
		return produtos;

	}

	private void parseResultSetToProduct(List<Produto> products, PreparedStatement pstm) throws SQLException {
		try (ResultSet resultSet = pstm.getResultSet()) {
			while (resultSet.next()) {
				Produto product = new Produto(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7),
						resultSet.getString(8));

				products.add(product);
			}
		}
	}

}
