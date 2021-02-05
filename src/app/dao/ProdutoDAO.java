
package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements ProdutoInterface {

	private Connection connection;

	public ProdutoDAO(Connection connection) {
		this.connection = connection;
	}

	@Override
	public List<Produto> buscarTodosProdutos() throws SQLException {
		List<Produto> produtos = new ArrayList<>();

		String sql = "SELECT * FROM PRODUTO";

		try (PreparedStatement pstm = connection.prepareStatement(sql)) {
			if (pstm.execute()) {
				try (ResultSet resultSet = pstm.getResultSet()) {
					while (resultSet.next()) {
						Produto produto = parseResultSetToProduct(resultSet);
						produto.setItem(buscarTodosItensProduto(produto.getCodigoproduto()));
						produtos.add(produto);
					}
				}
			}
		}

		return produtos;
	}

	public List<ItemProduto> buscarTodosItensProduto(int codigoProduto) throws SQLException {
		List<ItemProduto> itens = new ArrayList<>();

		String sql = "SELECT * FROM ITEM_PRODUTO WHERE codigoProduto = ?";

		try (PreparedStatement pstm = connection.prepareStatement(sql)) {
			pstm.setInt(1, codigoProduto);

			if (pstm.execute()) {
				try (ResultSet resultSet = pstm.getResultSet()) {
					while (resultSet.next()) {
						itens.add(parseResultSetToItemProduto(resultSet));
					}
				}
			}
		}

		return itens;
	}

	private Produto parseResultSetToProduct(ResultSet rs) throws SQLException {
		return new Produto(rs.getInt("CODIGOPRODUTO"), rs.getString("NOME"), rs.getString("DESCRICAO"),
				rs.getString("CATEGORIA"), rs.getString("ATRIBUTO1"), rs.getString("ATRIBUTO2"),
				rs.getString("ATRIBUTO3"), rs.getString("ATRIBUTO4"));
	}

	private ItemProduto parseResultSetToItemProduto(ResultSet resultSet) throws SQLException {
		return new ItemProduto(resultSet.getInt("CODIGOPRODUTO"), resultSet.getInt("CODIGOITEM"),
				resultSet.getString("NOME"), resultSet.getString("DESCRICAO"), resultSet.getString("CATEGORIA"),
				resultSet.getString("ATRIBUTO1"), resultSet.getString("ATRIBUTO2"), resultSet.getString("ATRIBUTO3"),
				resultSet.getString("ATRIBUTO4"));
	}

}
