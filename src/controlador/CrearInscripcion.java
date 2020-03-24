package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bean.Actividad;
import modelo.dao.ModeloActividad;
import modelo.dao.ModeloInscripcion;

/**
 * Servlet implementation class CrearInscripcion
 */
@WebServlet("/CrearInscripcion")
public class CrearInscripcion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearInscripcion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ModeloInscripcion mInscripciones = new ModeloInscripcion();
		
		mInscripciones.inscribir(Integer.parseInt(request.getParameter("idU")),Integer.parseInt(request.getParameter("idA")));
		
		ModeloActividad mActividades = new ModeloActividad();	
		
		ArrayList<Actividad> actividades = mActividades.selectAll();	
		
		request.setAttribute("actividades", actividades);
		
		request.getRequestDispatcher("verActividades.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
