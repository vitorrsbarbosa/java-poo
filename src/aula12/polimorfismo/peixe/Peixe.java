package aula12.polimorfismo.peixe;

import aula12.polimorfismo.Animal;

public abstract class Peixe extends Animal {
	private String corDaEscama;

	public Peixe( float peso, int idade, int membros, String corDaEscama ) {
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
		System.out.println( "O Peixe nada" );
	}

	@Override
	public void alimentar( ) {
		System.out.println( "Comer corais" );
	}

	@Override
	public void emitirSom( ) {
		System.out.println( "Peixe não faz som" );
	}

	public void soltarBolha( ) {
		System.out.println( "Soltou uma bolha" );
	}
}
