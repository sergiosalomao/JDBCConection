package br.com.sergio.jdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sergio.entidade.Usuario;

/**
 * Servlet implementation class SalvaUsuario
 */
@WebServlet(urlPatterns="/SalvaUsuario")
public class SalvaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SalvaUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		String tipo = request.getParameter("tipo");
		
		Usuario usuarios = new Usuario();
		usuarios.setUsuario(usuario);
		usuarios.setSenha(senha);
		usuarios.setTipo(tipo);
		
		UsuarioDAO usu = new UsuarioDAO();
		
		System.out.println(usuario);
		System.out.println(senha);
		System.out.println(tipo);
		
		usu.salvarUsuario(usuarios);
		
		
		response.sendRedirect("CadastraUsuario.html");		
	}

	}


