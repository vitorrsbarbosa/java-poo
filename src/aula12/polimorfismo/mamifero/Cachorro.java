package aula12.polimorfismo.mamifero;

public class Cachorro extends Mamifero {
	public Cachorro( float peso, int idade, int membros, String corDoPelo ) {
		super( peso, idade, membros, corDoPelo );
	}

	@Override
	public void locomover( ) {
		System.out.println( "Correr em quatro patas" );
	}

	@Override
	public void emitirSom( ) {
		System.out.println( "Latir" );
	}

	public void enterrarOsso( ) {
	}

	public void abanarRabo( ) {
	}
}
