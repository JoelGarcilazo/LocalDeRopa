package local.domain.dao;



import java.sql.ResultSet;

import local.domain.Carrito;

public class AbstractCarritoDaoImpl extends AbstractCarritoDao<Carrito> {

	@Override
	protected String getQueryAgregar() {
		return "INSERT INTO carrito (idProducto, nombre, foto, descripcion, precio, tamaño) SELECT idProducto, nombre, foto, descripcion, precio, tamaño FROM productos WHERE idProducto = ?";
	}

	@Override
	protected String getQueryListCarrito() {
		return "SELECT * FROM carrito";
	}

	@Override
	protected Carrito getPojoForCarrito(ResultSet rs) throws Exception {
		Carrito carrito = new Carrito();
		carrito.setIdProducto(rs.getInt(1));
		carrito.setNombre(rs.getString(2));
		carrito.setFoto(rs.getBinaryStream(3));
		carrito.setDescripcion(rs.getString(3));
		carrito.setPrecio(rs.getInt(4));
		carrito.setTamaño(rs.getString(5));
		
		return carrito;
	}

}
