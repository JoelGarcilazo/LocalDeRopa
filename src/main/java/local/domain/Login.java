package local.domain;

public class Login {

    private int idLogin;
	
	private String usuario;
	
	private String clave;
	
	private String rol;

	
	public Login(String usuario, String password, String rol) {
		this.usuario = usuario;
		this.clave = password;
		this.rol = rol;
	}
	
	
	
	public Login() {
		
	}
	
	
	
	public Login(int idLogin, String usuario, String clave, String rol) {
		super();
		this.idLogin = idLogin;
		this.usuario = usuario;
		this.clave = clave;
		this.rol = rol;
	
	}

	public int getIdLogin() {
		return idLogin;
	}

	public void setIdLogin(int idLogin) {
		this.idLogin = idLogin;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

}
