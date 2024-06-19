package local.domain.service;

import java.util.List;

import local.domain.Productos;
import local.domain.dao.AbstractAdminDao;
import local.domain.dao.AbstractAdminDaoImpl;

public class AdminServiceImpl implements AdminService{
	
	private AbstractAdminDao<Productos> adminDao = new AbstractAdminDaoImpl();

	@Override
	public List<Productos> listarProductos() throws Exception {
		
		return adminDao.toList();
	}

	@Override
	public void eliminarProducto(Productos productos) throws Exception {
		adminDao.eliminar(productos);
		
	}

	@Override
	public void modificarProducto(Productos productos) throws Exception {
		adminDao.modificar(productos);
	}

	@Override
	public void agregarProducto(Productos productos) throws Exception {
		adminDao.agregar(productos);
		
	}

}
