package pokemon;

public class PokemonPlante extends Pokemon {

	public PokemonPlante(String nom) {
		super(nom, TypePokemon.PLANTE);
	}

	@Override
	public void attaquer(Pokemon p) {
		
		String msg = "J'attaque " + p.getNom() + " : " + this.getType() + " vs " + p.getType();
		log(msg);
		
		p.subir(this);
	}

	@Override
	public void subir(Pokemon p) {
		
		String msg = "C'est ";

		double multiplicateur = 1.0;
		switch (p.getType()) {
			case EAU -> {
				switch (this.getType()) {
					case FEU -> {
						multiplicateur = 2;
						msg += "très efficace!";
					}
					case EAU, PLANTE -> {
						multiplicateur = 0.5;
						msg += "peu efficace...";
					}
				}
			}
			case FEU -> {
				switch (this.getType()) {
					case PLANTE -> {
						multiplicateur = 2.0;
						msg += "très efficace!";
					}
					case FEU, EAU -> {
						multiplicateur = 0.5;
						msg += "peu efficace...";
					}
				}
			}
			case PLANTE -> {
				switch (this.getType()) {
					case EAU -> {
						multiplicateur = 2.0;
						msg += "très efficace!";
					}
					case FEU, PLANTE -> {
						multiplicateur = 0.5;
						msg += "peu efficace...";
					}
				}
			}
		}
		
		int degats = (int)(p.getAtk() * multiplicateur);
		this.hp -= Math.max(0, this.hp - degats);
		
		this.log(msg);
	}
}


