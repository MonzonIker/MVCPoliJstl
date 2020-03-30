package controlador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bean.Usuario;
import modelo.dao.ModeloUsuario;

/**
 * Servlet implementation class ModificarUsuario
 */
@WebServlet("/ModificarUsuario")
public class ModificarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int idUsuario = Integer.parseInt(request.getParameter("id"));		
		ModeloUsuario mUsuario = new ModeloUsuario();		// crear un ojbeto de la clase Modelo Usuario	
		// Recuperar mediante request.getParameter los valores del formulario
		
		String nombre=request.getParameter("nombre");

		
		
		String dni=request.getParameter("dni");
		String codigo=request.getParameter("codigo");
		
		// crear una Usuario con los datos del formulario	
		Usuario Usuario=new Usuario();
		Usuario.setId(idUsuario);
		Usuario.setNombreApellido(nombre);
	    Usuario.setDni(dni);
	    Usuario.setCodigo(codigo);
	    
	    //insertar Usuario
		mUsuario.update(Usuario);	
		response.sendRedirect("verUsuarios");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
