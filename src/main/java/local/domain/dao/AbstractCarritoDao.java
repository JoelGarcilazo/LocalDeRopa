package local.domain.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import local.domain.Carrito;
import local.domain.Productos;
import local.domain.config.Connec;
import local.domain.exceptions.ErrorException;

public abstract class AbstractCarritoDao<T>  {

	private Connec connec = Connec.getInstance();
	
	
	public Carrito agregarCarrito() throws Exception {
		 ResultSet rs = null;
		 PreparedStatement st = null;
		 Productos productos = new Productos();		 
		 Carrito carrito = new Carrito();
		 
		 try {
			st = connec.dameConnection().prepareStatement(getQueryAgregar());
			
			rs = st.executeQuery();
			while(rs.next()){
				productos.setIdProducto(rs.getInt(1));
			}
				
		} catch (Exception e) {
			throw new ErrorException("Hubo un error al realizar la consulta", e);
		}finally {
			try {
				st.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		} 
		return carrito;
	} 
	
	public List<T> listaCarrito() throws Exception {
		 ResultSet rs = null;
		 List<T> list = null;
		 PreparedStatement st = null;
		 try{
			st = connec.dameConnection().prepareStatement(getQueryListCarrito());
			rs = st.executeQuery();
			list = new ArrayList<T>();
			 while (rs.next()) {
				T t = (T) getPojoForCarrito(rs);
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
	
	
	protected abstract  String getQueryAgregar();
	
	protected abstract String getQueryListCarrito();
	
	protected abstract T getPojoForCarrito(ResultSet rs) throws Exception;
	
	
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
