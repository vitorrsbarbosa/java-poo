package aula10.heranca;

public class Professor extends Pessoa{
	private String especialidade;
	private Float salario;

	public Professor( String nome, int idade, String sexo, String especialidade, Float salario) {
		super( nome, idade, sexo );
		this.setEspecialidade( especialidade );
		this.setSalario( salario );
	}

	public void status(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Especialidade: " + this.getEspecialidade());
		System.out.println("Salario: " + this.getSalario());
		System.out.println("-------------------------");
	}

	public String getEspecialidade( ) {
		return especialidade;
	}

	public void setEspecialidade( String especialidade ) {
		this.especialidade = especialidade;
	}

	public Float getSalario( ) {
		return salario;
	}

	public void setSalario( Float salario ) {
		this.salario = salario;
	}

	public void receberAumento(float aumento) {
		this.setSalario( this.getSalario() + aumento );
	}

}
