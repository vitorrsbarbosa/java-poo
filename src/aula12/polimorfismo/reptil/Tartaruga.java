package aula12.polimorfismo.reptil;

public class Tartaruga extends Reptil {
	public Tartaruga( float peso, int idade, int membros, String corDaEscama ) {
		super( peso, idade, membros, corDaEscama );
	}

	public void locomover( ) {
		System.out.println( "Andar muito devagar" );
	}
}
