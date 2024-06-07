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
import local.domain.service.ProductsService;
import local.domain.service.ProductsServiceImp;



@WebServlet( urlPatterns =  "/productos")
public class ProductsController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private ProductsService productsService = new ProductsServiceImp();
	private CarritoService carritoService = new CarritoServiceImpl();
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		RequestDispatcher ds = this.getServletContext().getRequestDispatcher("/productsPage.jsp");
		
		try {
			req.setAttribute("productos", productsService.listarProductos());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			carritoService.agregarProducto();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ds.forward(req, resp);
		
		
	}
	
}
