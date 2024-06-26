package local.domain.cotroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import local.domain.service.CarritoService;
import local.domain.service.CarritoServiceImpl;


@WebServlet( urlPatterns =  "/carrito")
public class AgregarCarritoController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CarritoService carritoService = new CarritoServiceImpl();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	RequestDispatcher ds = this.getServletContext().getRequestDispatcher("/carrito.jsp");
	
	switch (req.getParameter("accion")) {
	case "agregar":
		
		try {
			carritoService.agregarProducto();
		} catch ( Exception e) {
	
		}
		
		try {
			req.setAttribute("carrito", carritoService.listarCarrito() );
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		break;

	default:
		break;
	}
	
	
		
		/*try {
			req.setAttribute("carrito", carritoService.listarCarrito() );
			
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		ds.forward(req, resp);
		
		
		
	}
	
	
	

}
