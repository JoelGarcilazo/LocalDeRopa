package local.domain.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import local.domain.Productos;

public class AbstractAdminDaoImpl extends AbstractAdminDao<Productos>{

	@Override
	protected String getQueryList() {
		return "SELECT * FROM producto";
	}
	@Override
	protected String getQueryDelete() {
		return "DELETE FROM producto WHERE id_producto = ?";
	}
	@Override
	protected String getQueryModify() {
		return "UPDATE Producto SET nombre = ?, foto = ?, descripcion = ?, precio = ?, stock = ? WHERE id_producto = ?";
	}
	@Override
	protected String getQueryAdd() {
		return "INSERT INTO producto (nombre, foto, descripcion, precio, stock) VALUES (?,?,?,?,?)";
	}
	@Override
	protected Productos getPojo(ResultSet rs) throws Exception {
		Productos productos = new Productos();
		productos.setIdProducto(rs.getInt(1));
		productos.setNombre(rs.getString(2));
		productos.setFoto(rs.getBinaryStream(3));
		productos.setDescripcion(rs.getString(4));
		productos.setPrecio(rs.getInt(5));
		productos.setStock(rs.getInt(6));
		return productos;
	}

	@Override
	protected Productos getPojoAdd(ResultSet rs, PreparedStatement st) throws Exception {
		Productos productos = new Productos();
		st.setInt(1,productos.getIdProducto());
		st.setString(2,productos.getNombre());
		st.setBinaryStream(3,productos.getFoto());
		st.setString(4,productos.getDescripcion());
		st.setInt(5, productos.getPrecio());
		st.setInt(6, productos.getStock());
		return productos;
	}

}
