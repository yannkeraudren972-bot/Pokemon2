package dresseur;

import java.util.ArrayList;

import pokemon.Pokemon;


public class SacADos {
	
	private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>(3);
	
	private Dresseur dresseur;
	
	private Pokeball ball;
	
	public SacADos(Dresseur dresseur) {
		
		this.dresseur = dresseur;

	}
	
	public int getNbPokemons() {
		
		return this.pokemons.size();
	}
	
	public void capturerPokemons() {
		
		
	}
	
	public boolean peutCombattre() {
		
		for (Pokemon p : pokemons) {
			if (!p.isKO()) {
				return true;
			}
		}
		return false;
	}
	
	public void combattre(Dresseur adversaire) {
		
	}
	
	public void pokeCenter() {
		
		for (Pokemon p : pokemons) {
			p.soigner();
		}
	}

}
