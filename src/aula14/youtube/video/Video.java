package aula14.youtube.video;

public class Video implements AcoesVideo {
	private String titulo;
	private int avaliacao;
	private int visualizacoes;
	private int curtidas;
	private boolean reproduzindo;


	public Video( String titulo ) {
		this.setTitulo( titulo );
		this.setAvaliacao( 1 );
		this.setVisualizacoes( 0 );
		this.setReproduzindo( false );
	}

	public String getTitulo( ) {
		return titulo;
	}

	public void setTitulo( String titulo ) {
		this.titulo = titulo;
	}

	public int getAvaliacao( ) {
		return avaliacao;
	}

	public void setAvaliacao( int avaliacao ) {
		this.avaliacao = ( this.getAvaliacao( ) + avaliacao ) / this.visualizacoes;
	}

	public int getVisualizacoes( ) {
		return visualizacoes;
	}

	public void setVisualizacoes( int visualizacoes ) {
		this.visualizacoes = visualizacoes;
	}

	public int getCurtidas( ) {
		return curtidas;
	}

	public void setCurtidas( int curtidas ) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo( ) {
		return reproduzindo;
	}

	public void setReproduzindo( boolean reproduzindo ) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public void play( ) {
		this.setReproduzindo( true );
	}

	@Override
	public void pause( ) {
		this.setReproduzindo( false );
	}

	@Override
	public void like( ) {
		this.setCurtidas( this.getCurtidas( ) + 1 );
	}

	@Override
	public String toString( ) {
		return "Video{" +
				"titulo='" + titulo + '\'' +
				", avaliacao=" + avaliacao +
				", visualizacoes=" + visualizacoes +
				", curtidas=" + curtidas +
				", reproduzindo=" + reproduzindo +
				'}';
	}
}
