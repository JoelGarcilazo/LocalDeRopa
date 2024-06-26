package local.domain.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import local.domain.Login;
import local.domain.config.Connec;
import local.domain.exceptions.ErrorException;


public abstract class  AbstractLoginDao {
	
	private Connec connec = Connec.getInstance();
	
	public void logueo(Login user) throws Exception{
		ResultSet rs = null;
		PreparedStatement st = null;
		try {
			st = connec.dameConnection().prepareStatement(getQueryLogin());
			st.setString(1, user.getUsuario());
			rs = st.executeQuery();
			if (!rs.first()) {
				throw new Exception("No existe el usuario ingresado");	
			}	
		} catch (SQLException e) {
			System.out.println("");
		}finally {
			finalizar(st, rs);
		}
	
	}
	
	public void verificarClave(Login user) throws Exception {
		ResultSet rs = null;
		PreparedStatement st = null;
		
		try {
			st = connec.dameConnection().prepareStatement(getQueryPassword());
			st.setString(1, user.getUsuario());
			st.setString(2, user.getClave());
			rs = st.executeQuery();
			if (!rs.first()) {
				throw new ErrorException("No existe la clave ingresada");	
			}	
		} catch (SQLException e) {
			System.out.println("");
		}finally {
			finalizar(st, rs);
		}
	}
	
	public void verificarRol(Login user) throws Exception {
		ResultSet rs = null;
		PreparedStatement st = null;
		
		try {
			st = connec.dameConnection().prepareStatement(getQueryRol());
			st.setString(1, user.getUsuario());
			rs = st.executeQuery();
			if (rs.first()) {
				user.setUsuario(rs.getString(1));
				user.setRol(rs.getString(2));
			}	
		} catch (SQLException e) {
			System.out.println("");
		}finally {
			finalizar(st, rs);
		}
	}
	
	protected abstract String getQueryLogin();
	
	protected abstract String getQueryPassword(); 
	
	protected abstract String getQueryRol(); 
	
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
