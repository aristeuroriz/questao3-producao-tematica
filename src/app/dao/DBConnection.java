package app.dao;

import java.sql.Connection;
import java.sql.DriverManager;

class DBConnection {

	public static Connection conectaBD() {
		Connection conexao = null;
		try {
			conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=public", "postgres", "postgres");
		} catch (Exception e) {
			System.out.println("N�o foi poss�vel conectar ao bd" + e.getMessage());
		}
		return conexao;
	}

}