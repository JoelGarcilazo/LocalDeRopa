package local.domain.service;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import local.domain.Productos;

public interface ProductsService {

	public List<Productos> listarProductos() throws Exception;
	
	public void img(int id, HttpServletResponse resp) throws Exception;
	
	/*public Productos consultarProducts(int id) throws Exception;

	public void eliminarProducts(int id) throws Exception;
	
	public void editarProducts(Productos products) throws Exception;
*/
}
