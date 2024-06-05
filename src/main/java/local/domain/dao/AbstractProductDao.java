package local.domain.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import local.domain.config.Connec;
import local.domain.exceptions.ErrorException;

public abstract class AbstractProductDao<T> {
	
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
	
	
	public void listarImg(int id, HttpServletResponse response) {
		ResultSet rs = null;
		PreparedStatement st = null;
		String sql="select * from productos where id =" + id;
		InputStream inputStream = null;
		OutputStream outputStream = null;
		BufferedInputStream bufferedInputStream = null;
		BufferedOutputStream bufferedOutputStream = null;
		
		try {
			outputStream = response.getOutputStream();
			st = connec.dameConnection().prepareStatement(sql);
			rs = st.executeQuery();
			if (rs.next()) {
				inputStream = rs.getBinaryStream(3);
			}
			
			bufferedInputStream = new BufferedInputStream(inputStream);
			bufferedOutputStream = new BufferedOutputStream(outputStream);
			int i=0;
			
			while((i = bufferedInputStream.read())!=-1) {
				bufferedOutputStream.write(i);
				
			}
		} catch (Exception e) {
			
		}
	}
	protected abstract String getQueryList();
	
	protected abstract T getPojo(ResultSet rs ) throws Exception;
	
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
