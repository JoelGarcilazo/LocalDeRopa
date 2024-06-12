package local.domain.dao;

public class AbstractLoginDaoImpl extends AbstractLoginDao {

	@Override
	protected String getQueryLogin() {
		return "SELECT id_usuario, usuario, clave, rol FROM login WHERE usuario = ?";
	}

	@Override
	protected String getQueryPassword() {
		return "SELECT usuario, clave FROM login WHERE usuario = ? AND clave = ?";
	}

	@Override
	protected String getQueryRol() {
		return "SELECT usuario, rol FROM login WHERE usuario = ?";
	}

}
