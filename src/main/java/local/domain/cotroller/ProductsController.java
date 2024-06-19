package local.domain.cotroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import local.domain.service.AdminService;
import local.domain.service.AdminServiceImpl;
import local.domain.service.ProductsService;
import local.domain.service.ProductsServiceImp;

@WebServlet( urlPatterns =  "/productos")
public class ProductsController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private AdminService adminService = new AdminServiceImpl();
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		RequestDispatcher ds = this.getServletContext().getRequestDispatcher("/maquetado/adminDashboard/productos.jsp");
		
		try {
			req.setAttribute("productos", adminService.listarProductos());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		
		ds.forward(req, resp);
		
		
	}
	
}
