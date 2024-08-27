package aula12.polimorfismo.mamifero;

public class Cachorro extends Mamifero {
	public Cachorro( float peso, int idade, int membros, String corDoPelo ) {
		super( peso, idade, membros, corDoPelo );
	}

	@Override
	public void locomover( ) {
		System.out.println( "O Cachorro corre" );
	}

	public void enterrarOsso( ) {
	}

	public void abanarRabo( ) {
	}
}
