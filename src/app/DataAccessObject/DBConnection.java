package app.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

class DBConnection {

	public static Connection conectaBD() {
		Connection conexao = null;
		try {
			conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=public", "postgres", "postgres");
		} catch (Exception e) {
			System.out.println("Não foi possível conectar ao bd" + e.getMessage());
		}
		return conexao;
	}

}