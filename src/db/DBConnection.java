package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author c145149
 * Implementa classe de conexão com banco de dados
 */
public class DBConnection {

	/**
	 * Abre uma conexão com o banco de dados
	 *
	 * @return Connection
	 * @throws SQLException
	 */
	public static Connection connectDB() throws SQLException {
		return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=public", "postgres",
				"postgres");
	}

	/**
	 * Fecha a conexão com o banco de dados
	 *
	 * @param con
	 */
	public static void closeConnection(Connection con) {
		try {
			con.close();
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}

}