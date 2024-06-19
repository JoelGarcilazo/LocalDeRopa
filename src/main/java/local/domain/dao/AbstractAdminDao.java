package local.domain.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import local.domain.Productos;
import local.domain.config.Connec;
import local.domain.exceptions.ErrorException;

public abstract class AbstractAdminDao<T> {
	
	private Connec connec = Connec.getInstance();
	
	public List<T> toList() throws Exception {
		 ResultSet rs = null;
		 List<T> list = null;
		 PreparedStatement st = null;
		 try{
			st = connec.dameConnection().prepareStatement(getQueryList());
			rs = st.executeQuery();
			list = new ArrayList<T>();
			 while (rs.next()) {
				T t = (T) getPojo(rs);
				list.add(t);
			}
				
		 }catch (Exception e) {
				throw new ErrorException("Hubo un error al realizar la consulta", e);
		}finally {
			try {
				st.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		} 
		return list;
	}
	
	public void modificar(Productos productos) throws Exception{
		 ResultSet rs = null;
		 PreparedStatement st = null;
		 
		 try {
			st = connec.dameConnection().prepareStatement(getQueryModify());
			st.setInt(1,productos.getIdProducto());
			rs = st.executeQuery();
			if (!rs.first()) {
				throw new Exception("No existe el producto ingresado");	
			}	
		} catch (SQLException e) {
			System.out.println("");
		}finally {
			finalizar(st, rs);
		}
		 
		
	}
	
	public void eliminar(Productos productos) throws Exception{
		 ResultSet rs = null;
		 PreparedStatement st = null;
		 
		 try {
			st = connec.dameConnection().prepareStatement(getQueryDelete());
			st.setInt(1,productos.getIdProducto());
			rs = st.executeQuery();
			if (!rs.first()) {
				throw new Exception("No existe el producto ingresado");	
			}	
		} catch (SQLException e) {
			System.out.println("");
		}finally {
			finalizar(st, rs);
		}
	} 
	
	
	public void agregar(Productos productos) throws Exception{
		 ResultSet rs = null;
		 PreparedStatement st = null;
		 
		 try {
			st = connec.dameConnection().prepareStatement(getQueryAdd());
			getPojoAdd(rs, st);
		} catch (SQLException e) {
			System.out.println("");
		}finally {
			finalizar(st, rs);
		}
	} 
		
	
	
	protected abstract String getQueryList();
	
	protected abstract String getQueryDelete();
	
	protected abstract String getQueryModify();
	
	protected abstract String getQueryAdd();
	
	protected abstract T getPojo(ResultSet rs ) throws Exception;
	
	protected abstract T getPojoAdd(ResultSet rs, PreparedStatement st ) throws Exception;
	
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
