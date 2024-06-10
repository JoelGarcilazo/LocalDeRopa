package local.domain.cotroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import local.domain.Login;
import local.domain.service.LoginService;
import local.domain.service.LoginServiceImpl;

@WebServlet (urlPatterns = "/slogin")
public class LoginController extends HttpServlet  {

		private static final long serialVersionUID = 1L;
		private LoginService loginService = new LoginServiceImpl();

		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			HttpSession sesion = req.getSession();
			int conf= Integer.parseInt(req.getParameter("conf"));
			
			if (conf==0) {
				sesion.removeAttribute("sUsuario");
				sesion.removeAttribute("sRol");
				sesion.invalidate();
				resp.sendRedirect("login.jsp");	
			
			}
		}
		
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			HttpSession sesion = req.getSession();
		
			String usuario = req.getParameter("usuar");
			String clave = req.getParameter("password");
			Login user = new Login();
			Login log = new Login();

			user.setUsuario(usuario);
			user.setClave(clave);
			try {
				log = loginService.logueo(user);
			} catch (Exception e) {
				
			}
			
			
			if (log.getUsuario() != usuario) {
				resp.sendRedirect("/error.jsp");
			}	
							
				if  (log.getRol().equalsIgnoreCase("a")) {
						resp.sendRedirect("/administrador.jsp");
			}
				if (log.getRol().equalsIgnoreCase("u")) {
						resp.sendRedirect("/ProductosPage.jsp");
			}
				sesion.setAttribute("sUsuario", log.getUsuario());
				sesion.setAttribute("sRol", log.getRol());
					
		}

}
