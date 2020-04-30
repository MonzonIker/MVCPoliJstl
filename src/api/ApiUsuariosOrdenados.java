package api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONStringer;

import modelo.bean.Usuario;
import modelo.dao.ModeloUsuario;
import modelo.util.NombreComparator;
import modelo.util.NombreComparatorDesc;

/**
 * Servlet implementation class ApiUsuariosOrdenados
 */
@WebServlet("/ApiUsuariosOrdenados")
public class ApiUsuariosOrdenados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApiUsuariosOrdenados() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ModeloUsuario mUsuario = new ModeloUsuario();
		ArrayList<Usuario> Usuarios = mUsuario.selectAll();
		
		String filtro = request.getParameter("filtro");
		
		if (filtro.contentEquals("desc")) {
			Usuarios.sort(new NombreComparatorDesc());
		}else {
		Usuarios.sort(new NombreComparator());}
		
		String jsonString = JSONStringer.valueToString(Usuarios);
		PrintWriter out = response.getWriter();
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");            //kodifikazioa zehazten du
		out.print(jsonString);
		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
