package local.domain.service;

import java.util.List;

import local.domain.Productos;

public interface AdminService {
	
	public List<Productos> listarProductos() throws Exception;
	
	public void eliminarProducto(Productos productos) throws Exception;
	
	public void modificarProducto(Productos productos) throws Exception;
	
	public void agregarProducto(Productos productos) throws Exception;

}
