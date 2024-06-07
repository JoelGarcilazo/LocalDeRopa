package local.domain;

import java.io.InputStream;

public class Carrito {

	private int idCarrito;
	private int idProducto;
	private String nombre;
	private InputStream foto;
	private String descripcion;
	private int precio;
	private String tama�o;
	
	
	
	public Carrito(){
		
	}
	
	public Carrito(int idCarrito, int idProducto, String nombre, InputStream foto, String descripcion, int precio,
			String tama�o) {
		super();
		this.idCarrito = idCarrito;
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.foto = foto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.tama�o = tama�o;
	}
	
	public int getIdCarrito() {
		return idCarrito;
	}
	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public InputStream getFoto() {
		return foto;
	}
	public void setFoto(InputStream foto) {
		this.foto = foto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getTama�o() {
		return tama�o;
	}
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}
	
	
}
