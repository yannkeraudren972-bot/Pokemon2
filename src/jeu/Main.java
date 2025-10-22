package jeu;

import pokemon.Pokemon0;

public class Main {
	
	public static void main(String[] args) {
		
		//test Pokemon0
		System.out.println("\nTEST POKEMON0 \n");
		Pokemon0 p1 = new Pokemon0("Rhinolove");
		Pokemon0 p2 = new Pokemon0("chovsourir");
		
		p1.log(p1.toString());
		p2.log(p2.toString());
		p1.attaquer(p2);
		p2.log(p2.toString());
	}

}
