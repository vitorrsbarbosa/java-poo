package aula12.polimorfismo.ave;

import aula12.polimorfismo.Animal;

public abstract class Ave extends Animal {
	private String corDaPena;

	public Ave( float peso, int idade, int membros, String corDaPena ) {
		super( peso, idade, membros );
		this.corDaPena = corDaPena;
	}

	public String getCorDaPena( ) {
		return corDaPena;
	}

	public void setCorDaPena( String corDaPena ) {
		this.corDaPena = corDaPena;
	}

	@Override
	public void locomover( ) {
		System.out.println( "A Arara voa" );
	}

	@Override
	public void alimentar( ) {
		System.out.println( "Comer frutas" );
	}

	@Override
	public void emitirSom( ) {
		System.out.println( "Som de ave" );
	}

	public void fazerNinho( ) {
		System.out.println( "Fazendo ninho" );
	}
}
