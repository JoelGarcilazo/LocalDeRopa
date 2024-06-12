package local.domain.service;

import local.domain.Login;
import local.domain.dao.AbstractLoginDao;
import local.domain.dao.AbstractLoginDaoImpl;

public class LoginServiceImpl implements LoginService {

	 AbstractLoginDao loginDao = new AbstractLoginDaoImpl();
	@Override
	public void logueo(Login user) throws Exception {
		try {
			loginDao.logueo(user);
		} catch (Exception e) {
		}
	}

}
