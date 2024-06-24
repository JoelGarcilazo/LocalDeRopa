package local.domain.cotroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import local.domain.Productos;
import local.domain.service.AdminService;
import local.domain.service.AdminServiceImpl;


@WebServlet (urlPatterns = "/delete")
public class DeleteController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		AdminService adminService = new AdminServiceImpl();
		Productos productos = new Productos();
		req.getRequestDispatcher(getServletInfo())
		
		try {
			adminService.eliminarProducto(productos);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		resp.sendRedirect("/productos");
		
		
		
	}
	
	
	
	
	

}
