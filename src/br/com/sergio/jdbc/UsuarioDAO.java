package br.com.sergio.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.sergio.entidade.Usuario;



public class UsuarioDAO {

	public void salvarUsuario(Usuario usuario) {
		String sql = "INSERT INTO usuario (usuario,senha,tipo) values (?,?,?)";
		
		try {
			
			Connection con = ConectaJDBC.getConnection();
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, usuario.getUsuario() );
			ps.setString(2, usuario.getSenha() );
			ps.setString(3, usuario.getTipo() );
			ps.execute();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		
	
		
	}
	
}
