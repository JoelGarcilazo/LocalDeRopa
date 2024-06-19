package local.domain.dao;

public class AbstractLoginDaoImpl extends AbstractLoginDao {

	@Override
	protected String getQueryLogin() {
		return "SELECT id_usuario, nombre_usuario, email, clave, rol FROM login WHERE nombre_usuario = ?";
	}

	@Override
	protected String getQueryPassword() {
		return "SELECT nombre_usuario, clave FROM login WHERE nombre_usuario = ? AND clave = ?";
	}

	@Override
	protected String getQueryRol() {
		return "SELECT nombre_usuario, rol FROM login WHERE nombre_usuario = ?";
	}


}
