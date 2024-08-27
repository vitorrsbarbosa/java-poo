package aula10.heranca;

public final class Bolsista extends Aluno{
	private boolean ativo;
	private Float bolsa;

	public Float getBolsa( ) {
		return bolsa;
	}

	public void setBolsa( Float bolsa ) {
		this.bolsa = bolsa;
	}

	public boolean isAtivo( ) {
		return ativo;
	}

	public void setAtivo( boolean ativo ) {
		this.ativo = ativo;
	}

	public Bolsista( String nome, int idade, String sexo, int matricula, String curso, boolean ativo, Float bolsa ) {
		super( nome, idade, sexo, matricula, curso );
		this.ativo = ativo;
		this.bolsa = bolsa;
	}

	public void renovarBolsa(){
		System.out.println("Bolsa renovada com sucesso, pode continuar estudando");
		this.setAtivo( true );
	}

	@Override
	public void pagarMensalidade(){
		System.out.println("O aluno " + this.getNome() + " é bolsista!");
		System.out.print(" Pagamento facilitado realizado com sucesso");
	}
}
