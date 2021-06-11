package br.com.generation.exercicios;

public class SuperClasseAnimal implements Animal_Intarface {

	
	String nome ;
	int idade ;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void correr() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void escalar() {
		// TODO Auto-generated method stub
		
	}
}
