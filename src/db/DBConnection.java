package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	/**
	 * Abre uma conexão com o banco de dados
	 *
	 * @return
	 * @throws SQLException
	 */
	public static Connection connectDB() throws SQLException {
		return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=public", "postgres",
				"postgres");
//      return getOracleConnection();
	}

	/**
	 * Fecha a conexão com o banco de dados
	 *
	 * @param con
	 */
	public static void closeConnection(Connection con) {
		try {
			// con.commit();
			con.close();
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}

//	private stati//	private static Connection getOracleConnection() throws SQLException {
//	Properties info = new Properties();
//	info.put(OracleConnection.CONNECTION_PROPERTY_USER_NAME, "abu");
//	info.put(OracleConnection.CONNECTION_PROPERTY_PASSWORD, "abu");
//	info.put(OracleConnection.CONNECTION_PROPERTY_DEFAULT_ROW_PREFETCH, "20");
//
//	OracleDataSource ods = new OracleDataSource();
//	ods.setURL("jdbc:oracle:thin:@192.168.200.2:1521:xe");
//	ods.setConnectionProperties(info);
//
//	return ods.getConnection();
//}c Connection getOracleConnection() throws SQLException {
//		Properties info = new Properties();
//		info.put(OracleConnection.CONNECTION_PROPERTY_USER_NAME, "abu");
//		info.put(OracleConnection.CONNECTION_PROPERTY_PASSWORD, "abu");
//		info.put(OracleConnection.CONNECTION_PROPERTY_DEFAULT_ROW_PREFETCH, "20");
//
//		OracleDataSource ods = new OracleDataSource();
//		ods.setURL("jdbc:oracle:thin:@192.168.200.2:1521:xe");
//		ods.setConnectionProperties(info);
//
//		return ods.getConnection();
//	}

}