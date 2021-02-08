package app;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import app.dao.Produto;
import app.dao.ProdutoDAO;
import db.DBConnection;

/**
 * @author c145149 Implementa classe principal Produ��o Tem�tica
 */
public class ProducaoTematica {

	// M�todo principal
	public static void main(String[] args) {
		try {
			// Cria conex�o com banco de dados
			Connection connection = DBConnection.connectDB();
			// Instancia objeto ProdutoDAO com nova conex�o
			ProdutoDAO productDAO = new ProdutoDAO(connection);
			// Instancia m�todo buscarTodosProdutos via ProdutoDAO
			List<Produto> produtos = productDAO.buscarTodosProdutos();
			// Executa c�digo e imprime em console os dados obtidos no banco de dados
			produtos.stream().forEach(produto -> System.out.println(produto.toString()));
			// Fecha conex�o com banco de dados
			DBConnection.closeConnection(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
