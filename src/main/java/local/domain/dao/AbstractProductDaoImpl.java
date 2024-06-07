package local.domain.dao;

import java.sql.ResultSet;

import local.domain.Productos;

public class AbstractProductDaoImpl extends AbstractProductDao<Productos> {


	@Override
	protected String getQueryList() {
		return "SELECT * FROM productos";
	}


	@Override
	protected Productos getPojo(ResultSet rs) throws Exception {
		Productos productos = new Productos();
		productos.setIdProducto(rs.getInt(1));
		productos.setNombre(rs.getString(2));
		productos.setFoto(rs.getBinaryStream(3));
		productos.setDescripcion(rs.getString(4));
		productos.setPrecio(rs.getInt(5));
		productos.setTamaño(rs.getString(6));
		productos.setStock(rs.getInt(7));
		return productos;
	}







}
