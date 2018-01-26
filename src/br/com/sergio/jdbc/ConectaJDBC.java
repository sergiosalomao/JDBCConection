package br.com.sergio.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaJDBC {

	public static Connection getConnection() {
		String url = "jdbc:postgresql://localhost/sistema";
		String usuario = "postgres";
		String senha = "postgres";
		
		try {
			return DriverManager.getConnection(url,usuario, senha);
		} catch (SQLException e) {
		
			throw new RuntimeException();
		
		}
	}

}
