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

import modelo.bean.Actividad;
import modelo.dao.ModeloActividad;

/**
 * Servlet implementation class ModificarActividad
 */
@WebServlet("/ModificarActividad")
public class ModificarActividad extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarActividad() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int idActividad = Integer.parseInt(request.getParameter("id"));		
		ModeloActividad mActividad = new ModeloActividad();		// crear un ojbeto de la clase Modelo Actividad	
		// Recuperar mediante request.getParameter los valores del formulario
		Date fechaInicio = null;
		String nombre=request.getParameter("nombre");

		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			fechaInicio = formato.parse(request.getParameter("fecha"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String dias=request.getParameter("dias");
		int horas=Integer.parseInt(request.getParameter("horas"));
		int max=Integer.parseInt(request.getParameter("max"));
		Double precio=Double.parseDouble(request.getParameter("precio"));
		
		// crear una actividad con los datos del formulario	
		Actividad actividad=new Actividad();
		actividad.setId(idActividad);
		actividad.setNombre(nombre);
	    actividad.setFecha_inicio(fechaInicio);
	    actividad.setDias(dias);
	    actividad.setHoras(horas);
	    actividad.setMaxParticipantes(max);
	    actividad.setPrecio(precio);
	    
	    //insertar actividad
		mActividad.update(actividad);	
		response.sendRedirect("verActividades");
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
