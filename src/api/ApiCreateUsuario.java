package api;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import modelo.bean.Usuario;
import modelo.dao.ModeloUsuario;

/**
 * Servlet implementation class ApiCreateUsuario
 */
@WebServlet("/ApiCreateUsuario")
public class ApiCreateUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApiCreateUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String jsonUsuario = request.getParameter("usuario");
		JSONObject jsonObject = new JSONObject(jsonUsuario);
		if(jsonObject.getString("codigo").length()==4 && jsonObject.getString("dni").length()==9) {
			// crear usuario
			Usuario usuario = new Usuario();
	        usuario.setNombreApellido(jsonObject.getString("nombreApellido"));
	        
	        usuario.setCodigo(jsonObject.getString("codigo"));
	        usuario.setDni(jsonObject.getString("dni"));
	        ModeloUsuario mUsuario = new ModeloUsuario();
	        mUsuario.insert(usuario);
		}else
		
		
        response.setHeader("Access-Control-Allow-Origin","*");
	}

}
