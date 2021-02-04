package app;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import app.dao.Produto;
import app.dao.ProdutoDAO;
import db.DBConnection;

public class ProducaoTematica {

	public static void main(String[] args) {

		Connection connection = DBConnection.connectDB();

		ProdutoDAO productDAO = new ProdutoDAO(connection);

		try {
			List<Produto> produtos = productDAO.getAllProducts();

			for (int i = 0; i < produtos.size(); i++) {
				System.out.println(produtos.get(i).getNome() + ", " + produtos.get(i).getDescricao());

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
