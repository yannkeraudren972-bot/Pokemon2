package pokemon;

public enum TypePokemon {
	
	EAU("eau"),
	FEU("feu"),
	PLANTE("plante");
	
	private String name;
	
	private TypePokemon(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}

}
