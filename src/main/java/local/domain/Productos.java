package local.domain;

import java.io.InputStream;

import local.domain.enums.TypeCategory;
import local.domain.enums.TypeClothe;

public class Productos {
	
	private int idProducto;
	private String nombre;
	private InputStream foto;
	private String descripcion;
	private int precio;
	private String tama�o;
	private int stock;
	private TypeCategory typeCategory;
	private TypeClothe typeClothe;
	
	public Productos(){
		
	}

	public Productos(int idProducto, String nombre, InputStream foto, String descripcion, int precio, String tama�o,
			int stock, TypeCategory typeCategory, TypeClothe typeClothe) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.foto = foto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.tama�o = tama�o;
		this.stock = stock;
		this.typeCategory = typeCategory;
		this.typeClothe = typeClothe;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public TypeCategory getTypeCategory() {
		return typeCategory;
	}

	public void setTypeCategory(TypeCategory typeCategory) {
		this.typeCategory = typeCategory;
	}

	public TypeClothe getTypeClothe() {
		return typeClothe;
	}

	public void setTypeClothe(TypeClothe typeClothe) {
		this.typeClothe = typeClothe;
	}
	
	

	
	

	
	
}
	