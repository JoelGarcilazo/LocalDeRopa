package local.domain.service;

import local.domain.Login;

public interface LoginService {

	public void logueo(Login user) throws Exception;
	
	public void verificarPassword(Login user) throws Exception;
	
	public void verificarRol(Login user) throws Exception;
}
