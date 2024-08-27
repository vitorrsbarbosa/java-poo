package aula12.polimorfismo.reptil;

import aula12.polimorfismo.Animal;

public abstract class Reptil extends Animal {
	private String corDaEscama;

	public Reptil( float peso, int idade, int membros, String corDaEscama ) {
		super( peso, idade, membros );
		this.corDaEscama = corDaEscama;
	}

	public String getCorDaEscama( ) {
		return corDaEscama;
	}

	public void setCorDaEscama( String corDaEscama ) {
		this.corDaEscama = corDaEscama;
	}

	@Override
	public void locomover( ) {
		System.out.println( "Rastejar" );
	}

	@Override
	public void alimentar( ) {
		System.out.println( "Comer coisas de réptil" );
	}

	@Override
	public void emitirSom( ) {
		System.out.println( "Fazer som de réptil" );
	}
}
