package pokemonproto;

import java.util.Random;

public class Pokemon0 {
	
	private static java.util.Random r = new Random();
	
	private String nom;
	private int niveau;
	private int hp;
	private int atk;
	
	
	public Pokemon0(String nom) {
		
		this.nom = nom;
		this.niveau = r.nextInt(1, 11);
		this.hp = this.niveau * 2;
		this.atk = (this.niveau / 2) + 1;
		
	}
	
	
	public boolean isKO() {
		
		if (this.hp == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void soigner() {
		
		this.hp = 2 * this.niveau;
	}
	
	public void attaquer(Pokemon0 p) {
		
		int hp2 = p.getHp();
		
		hp2 = Math.max(0, hp2- this.atk);
		
		p.setHp(hp2);
		
		String msg = "J'attaque " + p.getNom();
		log(msg);
		
		if (p.isKO()) {
			msg = "Je suis KO";
			p.log(msg);
		}
	}
		
	// Getteurs
	public int getAtk() {
		return atk;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getNiveau() {
		return niveau;
	}
	
	public String getNom() {
		return nom;
	}	
	
	
	// Setteurs
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		
		return "Je m'appelle " + this.nom +
				"\nje suis de niveau " + this.niveau +
				"\nj'ai " + this.hp + " points de vie \n" +
				"mon attaque de base est de " + this.atk + "\n";
	}
	
	public void log(String msg) {
		
		System.out.println("[Pokemon " + this.nom + "] : " + msg);
	}

}
