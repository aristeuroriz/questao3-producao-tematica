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
			List<Produto> produtos = productDAO.buscarTodosProdutos();

			for (int i = 0; i < produtos.size(); i++) {
				System.out.println(produtos.get(i).getCodigoproduto() + ", " + produtos.get(i).getNome() + ", "
						+ produtos.get(i).getDescricao() + ", " + produtos.get(i).getAtributo1() + ", "
						+ produtos.get(i).getAtributo2() + ", " + produtos.get(i).getAtributo3() + ", "
						+ produtos.get(i).getAtributo4() + ", ");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
