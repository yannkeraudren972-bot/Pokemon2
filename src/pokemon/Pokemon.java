package pokemon;

import java.util.Random;

public abstract class Pokemon {
	
	
	
	private String nom;
	protected int hp;
	private int atk;
	private int niveau;
	private static final int NiveauMax = 10;
	
	private TypePokemon type;
	
	private static final java.util.Random random = new Random();
	
	public Pokemon(String nom, TypePokemon type) {
		
		this.nom = nom;
		this.niveau = random.nextInt(1, 11);
		this.hp = this.niveau * 2;
		this.atk = (this.niveau / 2) + 1;
		this.type = type;
		
	}
	// Getteurs
	public String getNom() {
		return nom;
	}	
	
	public int getHp() {
		return hp;
	}
	
	public int getAtk() {
		return atk;
	}
	
	
	
	public int getNiveau() {
		return niveau;
	}
	
	
	
	public TypePokemon getType() {
		return this.type;
	}
	
	public boolean isKO() {
		
		if (this.hp == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public abstract void attaquer(Pokemon p);
	
	public abstract void subir(Pokemon p);
	
	public void soigner() {
		
		this.hp = 2 * this.niveau;
	}
	
	
	@Override
	public String toString() {
		
		return "Je m'appelle " + this.nom +
				"\nje suis de niveau " + this.niveau +
				"\nj'ai " + this.hp + " points de vie \n" +
				"mon attaque de base est de " + this.atk + "\n";
	}
	
	
	
	private String prefixe() {
		return "";
	}
	
	
	
	public void log(String msg) {
		
		System.out.println("[Pokemon " + this.nom + "] : " + msg);
	}

}
