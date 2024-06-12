package local.domain.dao;

public class AbstractLoginDaoImpl extends AbstractLoginDao {

	@Override
	protected String getQueryLogin() {
		return "SELECT id_usuario, usuario, clave, rol FROM login WHERE usuario = ?";
	}

}
