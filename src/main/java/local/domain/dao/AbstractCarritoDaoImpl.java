package local.domain.dao;

import java.sql.ResultSet;


import local.domain.Carrito;

public class AbstractCarritoDaoImpl extends AbstractCarritoDao<Carrito> {

	@Override
	protected String getQueryAgregar() {
		return "INSERT INTO local.carrito (idProducto, nombre, foto, descripcion, precio, tamaño) VALUES (?, ?, ?, ?, ?, ?)";
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
		carrito.setDescripcion(rs.getString(4));
		carrito.setPrecio(rs.getInt(5));
		carrito.setTamaño(rs.getString(6));
		
		return carrito;
	}

}
