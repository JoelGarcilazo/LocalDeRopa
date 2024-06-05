package local.domain.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import local.domain.Productos;
import local.domain.dao.AbstractProductDao;
import local.domain.dao.AbstractProductDaoImpl;


public class ProductsServiceImp implements ProductsService {
	
	private AbstractProductDao<Productos> productDao = new AbstractProductDaoImpl();

	@Override
	public List<Productos> listarProductos() throws Exception {
		return productDao.toList();
	}

	@Override
	public void img(int id, HttpServletResponse resp) throws Exception {
		productDao.listarImg(id, resp);
		
	}



	/*@Override
	public Productos consultarProducts(int id) throws Exception {
		return productDao.consultId(id);
	}

	@Override
	public void eliminarProducts(int id) throws Exception {
		productDao.delete(id);
	}

	@Override
	public void editarProducts(Productos products) throws Exception {
		productDao.edit(products);		
	}*/

}
