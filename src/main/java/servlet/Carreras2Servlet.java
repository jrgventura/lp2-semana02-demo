package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import daos.*;
import model.Carreras;

@WebServlet("/Carreras2Servlet")
public class Carreras2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;	
    
    public Carreras2Servlet() {
        super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
    	String accion = request.getParameter("accion");

        String nombre = request.getParameter("carrera");
        Boolean estado = Boolean.valueOf(request.getParameter("estado"));
        
        Carreras c = new Carreras();
        c.setCarrera(nombre);
        c.setEstado(estado);
        
        CarreraDao dao = new CarrerasDaoImpl();
        dao.create(c);
    }
	

}
