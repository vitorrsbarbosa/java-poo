package aula12.polimorfismo.mamifero;

public class Canguru extends Mamifero {
	public Canguru( float peso, int idade, int membros, String corDoPelo ) {
		super( peso, idade, membros, corDoPelo );
	}

	public void usarBolsa( ) {
	}

	public void locomover( ) {
		System.out.println( "Pular" );
	}
}
