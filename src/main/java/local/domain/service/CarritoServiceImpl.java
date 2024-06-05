package local.domain.service;

import java.util.List;

import local.domain.Carrito;
import local.domain.Productos;
import local.domain.dao.AbstractCarritoDao;
import local.domain.dao.AbstractProductDao;
import local.domain.dao.AbstractProductDaoImpl;

public class CarritoServiceImpl implements CarritoService {
	
	private AbstractCarritoDao<Carrito> carritoDao = new AbstractCarritoDaoImpl();

	
	public List<Carrito> listarCarrito() throws Exception {
		return carritoDao.listaCarrito();
	}

	@Override
	public Carrito agregarProducto() throws Exception {
		return carritoDao.agregarCarrito();
	}

}
