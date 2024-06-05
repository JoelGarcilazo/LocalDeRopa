package local.domain.service;

import java.util.List;

import local.domain.Carrito;
public interface CarritoService {
	
	public List<Carrito> listarCarrito() throws Exception;
	
	public Carrito agregarProducto() throws Exception;
	

}
