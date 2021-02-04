package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection connectDB() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=public",
					"postgres", "postgres");
		} catch (Exception e) {
			System.out.println("N�o foi poss�vel conectar ao bd" + e.getMessage());
		}
		return connection;
	}

}