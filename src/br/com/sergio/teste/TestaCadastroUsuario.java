package br.com.sergio.teste;
import br.com.sergio.entidade.Usuario;
import br.com.sergio.jdbc.UsuarioDAO;


public class TestaCadastroUsuario {

	public static void main(String[] args) {

		Usuario usuario = new Usuario();
		
		UsuarioDAO usu = new UsuarioDAO();
		usu.salvarUsuario(usuario);

	}

}
