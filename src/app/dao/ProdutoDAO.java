package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author c145149 Implementa classe camada DAO para Produto
 */
public class ProdutoDAO implements ProdutoInterface {

	private Connection connection;

	// M�todo construtor da classe Produto DAO
	public ProdutoDAO(Connection connection) {
		this.connection = connection;
	}

	/**
	 * M�todo para buscar todos os produtos
	 * 
	 * @return List produtos
	 */
	public List<Produto> buscarTodosProdutos() throws SQLException {
		// Declara��o de array de Produtos
		List<Produto> produtos = new ArrayList<>();

		// Consulta Produtos SQL
		String sql = "SELECT * FROM PRODUTO";

		// Realiza conex�o e executa a query
		try (PreparedStatement pstm = connection.prepareStatement(sql)) {
			if (pstm.execute()) {
				// Recebe resultados da query
				try (ResultSet resultSet = pstm.getResultSet()) {
					// Intera cara item retornado na query
					while (resultSet.next()) {
						// Retorna atributos da query
						Produto produto = parseResultSetToProduto(resultSet);
						// Adiciona todos os respectivos Item de Produtos para seu Produto
						produto.setItem(buscarTodosItensProduto(produto.getCodigoproduto()));
						// Adiciona cada Produto estruturado � Lista de Produtos
						produtos.add(produto);
					}
				}
			}
		}
		return produtos;
	}

	/**
	 * M�todo para retornar todos itens de produtos
	 * 
	 * @return List itens
	 */
	public List<ItemProduto> buscarTodosItensProduto(int codigoProduto) throws SQLException {
		// Declara��o de array de Item de Produto
		List<ItemProduto> itens = new ArrayList<>();
		// Consulta Produtos SQL
		String sql = "SELECT * FROM ITEM_PRODUTO WHERE codigoProduto = ?";

		// Realiza conex�o e executa a query
		try (PreparedStatement pstm = connection.prepareStatement(sql)) {
			// Indica o c�digo do produto para parametrizar a query
			pstm.setInt(1, codigoProduto);
			// Realiza conex�o e executa a query
			if (pstm.execute()) {
				// Recebe resultados da query
				try (ResultSet resultSet = pstm.getResultSet()) {
					// Recebe resultados da query
					while (resultSet.next()) {
						// Adiciona cada Item de Produto estruturado � Lista de Itens
						itens.add(parseResultSetToItemProduto(resultSet));
					}
				}
			}
		}

		return itens;
	}

	/**
	 * M�todo para retornar valores dos Produtos
	 * 
	 * @return Produto
	 */
	private Produto parseResultSetToProduto(ResultSet rs) throws SQLException {
		return new Produto(rs.getInt("CODIGOPRODUTO"), rs.getString("NOME"), rs.getString("DESCRICAO"),
				rs.getString("CATEGORIA"), rs.getString("ATRIBUTO1"), rs.getString("ATRIBUTO2"),
				rs.getString("ATRIBUTO3"), rs.getString("ATRIBUTO4"));
	}

	/**
	 * M�todo para retornar valores dos Itens de Produto
	 * 
	 * @return ItemProduto
	 */
	private ItemProduto parseResultSetToItemProduto(ResultSet resultSet) throws SQLException {
		return new ItemProduto(resultSet.getInt("CODIGOPRODUTO"), resultSet.getInt("CODIGOITEM"),
				resultSet.getString("NOME"), resultSet.getString("DESCRICAO"), resultSet.getString("CATEGORIA"),
				resultSet.getString("ATRIBUTO1"), resultSet.getString("ATRIBUTO2"), resultSet.getString("ATRIBUTO3"),
				resultSet.getString("ATRIBUTO4"));
	}

}
