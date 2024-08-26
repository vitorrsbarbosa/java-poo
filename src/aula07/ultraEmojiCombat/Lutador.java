package aula07.ultraEmojiCombat;

public class Lutador {
    private String nome, nacionalidade,categoria;
    private float altura,peso;
    private int idade,vitorias,derrotas,empates;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(peso);
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(float peso) {
        if (peso < 52.2f || peso > 120.2f) {
            this.categoria = "Inválido";
        } else if (peso <= 70.3f) {
            this.categoria = "Leve";
        } else if (peso <= 83.9f) {
            this.categoria = "Médio";
        } else if (peso <= 120.2f) {
            this.categoria = "Pesado";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    public void apresentarLutador(){
        System.out.println("---------------------------------------");
        System.out.println("CHEGOU A HORA!");
        System.out.println("Aqui está o lutador " + getNome() + "!!!!");
        System.out.println("Diretamente de " + getNacionalidade());
        System.out.println("Com apenas " + getIdade() + " anos");
        System.out.println("E " + getAltura() + "m de altura");
        System.out.println("Pesando " + getPeso() + "Kg");
        System.out.println("Tendo um incrível cartel de "+ (getVitorias()+getDerrotas()+getEmpates()) + " lutas em seu nome");
        System.out.println("Sendo elas " + getVitorias() + " Vitorias");
        System.out.println(getEmpates() + " empates e " + getDerrotas() + " derrotas");
    }

    public void status(){
        System.out.println("Lutador " + getNome());
        System.out.println("É um peso " + getCategoria());
        System.out.println("Com " + getVitorias() + " Vitórias,");
        System.out.println( getEmpates() + " Empates");
        System.out.println("E " + getDerrotas() + " Derrotas");
    }

    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }
}
