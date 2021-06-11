package br.com.generation.exercicios;

public class ImpressaoAnimal {

	public static void main(String[] args) {
		
		TestaAnimal t1 = new TestaAnimal() ;
		
		t1.correr(new Preguiça()) ;
	    t1.subir(new Cachorro());
	    t1.correr(new Cavalo()) ;
	}
	
} 
