package aula12.polimorfismo.mamifero;

import aula12.polimorfismo.Animal;

public abstract class Mamifero extends Animal {
	private String corDoPelo;

	public Mamifero( float peso, int idade, int membros, String corDoPelo ) {
		super( peso, idade, membros );
		this.setCorDoPelo( corDoPelo );
	}

	public String getCorDoPelo( ) {
		return corDoPelo;
	}

	public void setCorDoPelo( String corDoPelo ) {
		this.corDoPelo = corDoPelo;
	}

	@Override
	public void locomover( ) {
		System.out.println( "Correndo" );
	}

	@Override
	public void alimentar( ) {
		System.out.println( "Mamando" );
	}

	@Override
	public void emitirSom( ) {
		System.out.println( "Fazer som de mamífero" );
	}
}
