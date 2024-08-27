package aula10.heranca;

public class Funcionario extends Pessoa{
	private String setor;
	private boolean trabalhando;

	public Funcionario( String nome, int idade, String sexo, String setor, boolean trabalhando ) {
		super( nome, idade, sexo );
		this.setSetor( setor );
		this.setTrabalhando( trabalhando );
	}

	public void status(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Setor: " + this.getSetor());
		System.out.println("Está trabalhando? " + this.isTrabalhando());
		System.out.println("-------------------------");
	}

	public String getSetor( ) {
		return setor;
	}

	public void setSetor( String setor ) {
		this.setor = setor;
	}

	public boolean isTrabalhando( ) {
		return trabalhando;
	}

	public void setTrabalhando( boolean trabalhando ) {
		this.trabalhando = trabalhando;
	}

	public void mudarTrabalho( ) {
		System.out.println("Alteração de estado realizada");
		this.trabalhando = ! this.trabalhando;
	}
}
