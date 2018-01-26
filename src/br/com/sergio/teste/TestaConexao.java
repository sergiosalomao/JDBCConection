package br.com.sergio.teste;

import java.sql.Connection;
import java.sql.SQLException;
import br.com.sergio.jdbc.ConectaJDBC;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		System.out.println("iniciando o teste...");

		Connection conexao = ConectaJDBC.getConnection();
		System.out.println("Conectado com sucesso");
		conexao.close();

	}

}
