package aula10.heranca;

public class Aluno extends Pessoa{
//	Herança para implementação
//	Faz alterações/adições que a classe progenitora não tem

	private int matricula;
	private String curso;

	public Aluno( String nome, int idade, String sexo, int matricula, String curso ) {
		super( nome, idade, sexo );
		this.setMatricula( matricula );
		this.setCurso( curso );
	}

	public void status(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Matrícula: " + this.getMatricula());
		System.out.println("Curso: " + this.getCurso());
		System.out.println("-------------------------");
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

	public void pagarMensalidade(){
		System.out.println("Pagando mensalidade do aluno " + this.getNome());
	}

	public void cancelarMatricula() {
		System.out.println("Matrícula cancelada com sucesso, foi bom te ter por aqui");
		this.setMatricula( 0 );
		this.setCurso( null );
	}
}
