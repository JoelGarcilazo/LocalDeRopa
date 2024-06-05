package local.domain.enums;

public enum TypeCategory {
	
	women("women"),
	men("men"),
	kids("kids");
	
	private String type;

	private TypeCategory(String type) {
		this.type = type;
	}

	
	public String getTipo() {
		return type;
	}
	public void setTipo(String type) {
		this.type = type;
	}
	
	

}
