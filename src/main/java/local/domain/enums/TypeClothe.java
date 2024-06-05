package local.domain.enums;

public enum TypeClothe {
	
	TShirt("TShirt"),
	Buzo("buzo");
	
	private String type;

	private TypeClothe(String type) {
		this.type = type;
	}

	
	public String getTipo() {
		return type;
	}
	public void setTipo(String type) {
		this.type = type;
	}

}
