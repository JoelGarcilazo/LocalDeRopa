package local.domain.cotroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import local.domain.service.ProductsService;
import local.domain.service.ProductsServiceImp;

public class imgcontroller extends HttpServlet{
	
	
	private static final long serialVersionUID = 1L;
	private ProductsService productsService = new ProductsServiceImp();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			productsService.img(id, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
	
		}
	}

}
