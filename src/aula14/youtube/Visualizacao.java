package aula14.youtube;

import aula14.youtube.pessoa.Gafanhoto;
import aula14.youtube.video.Video;

public class Visualizacao {
	private Video filme;
	private Gafanhoto espectador;

	public Visualizacao( Gafanhoto espectador, Video filme ) {
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotalAssistido( this.espectador.getTotalAssistido( ) + 1 );
		this.filme.setVisualizacoes( this.filme.getVisualizacoes( ) + 1 );
	}

	public Video getFilme( ) {
		return filme;
	}

	public void setFilme( Video filme ) {
		this.filme = filme;
	}

	public Gafanhoto getEspectador( ) {
		return espectador;
	}

	public void setEspectador( Gafanhoto espectador ) {
		this.espectador = espectador;
	}

	@Override
	public String toString( ) {
		return "Visualizacao{" +
				"espectador=" + espectador +
				", filme=" + filme +
				'}';
	}

	public void avaliar( ) {
		this.filme.setAvaliacao( 5 );
	}

	public void avaliar( int nota ) {
		this.filme.setAvaliacao( nota );
	}

	public void avaliar( float porcentagem ) {
		int total = 0;
		if( porcentagem <= 20 ) {
			total = 3;
		} else if( porcentagem <= 50 ) {
			total = 5;
		} else if( porcentagem <= 80 ) {
			total = 8;
		} else {
			total = 10;
		}
		this.filme.setAvaliacao( total );
	}
}
