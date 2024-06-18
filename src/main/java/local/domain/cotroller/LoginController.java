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
			

			user.setUsuario(usuario);
			user.setClave(clave);
			try {
				//verificar existencia de usuario
				loginService.logueo(user);
				//verificar password
				loginService.verificarPassword(user);
				
			} catch (Exception e) {
				resp.sendRedirect("/error.jsp");
			}
			
			resp.sendRedirect("/home");
			
				sesion.setAttribute("sUsuario", user.getUsuario());
				sesion.setAttribute("sRol", user.getRol());
				
				
		}

}
