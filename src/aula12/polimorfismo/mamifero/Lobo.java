package aula12.polimorfismo.mamifero;

public class Lobo extends Mamifero {
	public Lobo( float peso, int idade, int membros, String corDoPelo ) {
		super( peso, idade, membros, corDoPelo );
	}

	@Override
	public void locomover( ) {
		System.out.println( "Trotar" );
	}

	@Override
	public void emitirSom( ) {
		System.out.println( "Uivar" );
	}
}
