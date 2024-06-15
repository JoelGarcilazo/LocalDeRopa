package local.domain.cotroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( urlPatterns =  "/agregarProducto")
public class AgregarProductoController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		RequestDispatcher ds = this.getServletContext().getRequestDispatcher("/maquetado/adminDashboard/agregarProducto.jsp");
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ds.forward(req, resp);
		
		
	}
	
}