package aula12.polimorfismo.mamifero;

import java.util.Objects;

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

	public void reagir( String frase ) {
		if( Objects.equals( frase, "Toma comida" ) || Objects.equals( frase, "Olá" ) ) {
			System.out.println( "Abanar e latir felizmente" );
		} else {
			System.out.println( "Rosnar" );
		}
	}

	public void reagir( int hora, int minuto ) {
		if( hora < 12 ) {
			System.out.println( "Abanar" );
		} else if( hora <= 18 ) {
			System.out.println( "Abanar e latir" );
		} else {
			System.out.println( "Ignorar" );
		}
	}

	public void reagir( boolean dono ) {
		if( dono ) {
			System.out.println( "Abanar felizmente" );
		} else {
			System.out.println( "Rosnar e latir" );
		}
	}
}
