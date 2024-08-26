package aula10.heranca;

public class Aluno extends Pessoa{
	private int matricula;
	private String curso;

	public Aluno( String nome, int idade, String sexo, int matricula, String curso ) {
		super( nome, idade, sexo );
		this.setMatricula( matricula );
		this.setCurso( curso );
	}

	public int getMatricula( ) {
		return matricula;
	}

	public void setMatricula( int matricula ) {
		this.matricula = matricula;
	}

	public String getCurso( ) {
		return curso;
	}

	public void setCurso( String curso ) {
		this.curso = curso;
	}

	public void cancelarMatricula() {
		this.setMatricula( 0 );
		this.setCurso( null );
	}
}
