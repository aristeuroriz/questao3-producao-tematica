package app.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ProductDAO implements ProductInterface {

	public List<Product> getAllProducts() throws SQLException {
		Connection connection = DBConnection.conectaBD();
		Statement statement = connection.createStatement();

		try {

			ResultSet resultSet = statement.executeQuery("SELECT \r\n" + "	PRODUTO.NOME PRODUTO, \r\n"
					+ "	ITEM_PRODUTO.NOME ITEM,\r\n" + "	ITEM_PRODUTO.CODIGOITEM COD_ITEM,\r\n"
					+ "	PRODUTO.CODIGOPRODUTO COD_PROD\r\n" + "FROM PRODUTO \r\n" + "INNER JOIN ITEM_PRODUTO\r\n"
					+ "ON PRODUTO.CODIGOPRODUTO = ITEM_PRODUTO.CODIGOPRODUTO");
			if (!resultSet.next()) {
				System.out.println("Nenhum registro encontrado");
			} else {

				ResultSetMetaData rsmd = resultSet.getMetaData();
				int columnsNumber = rsmd.getColumnCount();

				while (resultSet.next()) {
					for (int i = 1; i <= columnsNumber; i++) {
						if (i > 1)
							System.out.print(",  ");
						// System.out.print(rsmd.getColumnName(1));
						String columnValue = resultSet.getString(i);
						System.out.print(columnValue);

					}
					System.out.println("");
				}

			}
			statement.close();
			connection.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;

	}

}