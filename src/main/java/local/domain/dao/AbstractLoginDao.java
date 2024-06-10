package local.domain.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import local.domain.Login;
import local.domain.config.Connec;

public abstract class  AbstractLoginDao {
	
	private Connec connec = Connec.getInstance();
	
	public Login logueo(Login user) throws Exception{
			ResultSet rs = null;
			PreparedStatement st = null;
			try {
				st = connec.dameConnection().prepareStatement(getQueryLogin());
				st.setString(1, user.getUsuario());
				rs = st.executeQuery();
				if (!rs.first()) {
					throw new Exception();
				}
			} catch (SQLException e) {
		
			}finally {
				finalizar(st, rs);
		}
			return user;
	}
	
	protected abstract String getQueryLogin();
	
	public void finalizar(PreparedStatement st, ResultSet rs) throws Exception{
		
		try {
			st.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
