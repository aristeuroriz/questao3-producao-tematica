package app;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import app.dao.Produto;
import app.dao.ProdutoDAO;
import db.DBConnection;

/**
 * @author c145149 Implementa classe principal Produção Temática
 */
public class ProducaoTematica {

	// Método principal
	public static void main(String[] args) {
		try {
			// Cria conexão com banco de dados
			Connection connection = DBConnection.connectDB();
			// Instancia objeto ProdutoDAO com nova conexão
			ProdutoDAO productDAO = new ProdutoDAO(connection);
			// Instancia método buscarTodosProdutos via ProdutoDAO
			List<Produto> produtos = productDAO.buscarTodosProdutos();
			// Executa código e imprime em console os dados obtidos no banco de dados
			produtos.stream().forEach(produto -> System.out.println(produto.toString()));
			// Fecha conexão com banco de dados
			DBConnection.closeConnection(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
