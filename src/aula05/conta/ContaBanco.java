package aula05.conta;

public class ContaBanco {
//    Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //    Construtor
    void contaBanco(){
        this.setStatus(false);
        this.setSaldo(0.0f);
    }
    public void estadoAtual(){
        System.out.println("---------------------------------------");
        System.out.println("Número da conta: " + this.getNumConta() );
        System.out.println("Tipo da conta: " +       this.getTipo() );
        System.out.println("Dono da conta: " +       this.getDono() );
        System.out.println("Saldo da conta: " +     this.getSaldo() );
        System.out.println("Status: " +            this.getStatus() );
        System.out.println("---------------------------------------");
    }
    //    Métodos especiais
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numero) {
        this.numConta += numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float novoSaldo) {
        this.saldo += novoSaldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo){
        this.setStatus(true);
        this.setTipo(tipo);
        if(tipo.equals("CC")){
            this.setSaldo(50.0f);
        }
        if(tipo.equals("CP")){
            this.setSaldo(150.0f);
        }
        this.setNumConta(1);
    }
    public void fecharConta(){
        if (this.getSaldo()>0) {
            System.out.println("Há saldo na conta no valor de " + this.getSaldo());
        } else if(this.getSaldo()<0) {
            System.out.println("Há débitos na conta no valor de " + this.getSaldo());
        } else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float valor){
        if(this.getStatus()) {
            this.setSaldo( +valor);
            System.out.println("Depósito realizado com sucesso no valor de " + valor);
        } else {
            System.out.println("Impossível depositar em conta desativada");
        }
    }
    public void sacar(float valor){
        if(this.getStatus()) {
            if ( this.getSaldo() >= valor ){
                this.setSaldo( -valor);
                System.out.println("Saque realizado com sucesso! no valor de " + valor);
            } else {
                System.out.println("Saldo insuficiente para sacar " + valor);
            }
        } else {
                System.out.println("Impossível sacar em conta desativada");
        }
    }
    public void pagarMensalidade(String tipo){
        float mensalidade = 0.0f;
        if(tipo.equals("CC")){
            mensalidade = 12.0f;
        } else if(tipo.equals("CP")){
            mensalidade = 20.0f;
        } else {
            System.out.println("Conta inválida");
        }
        if(this.getStatus()){
            this.setSaldo(-mensalidade);
            System.out.println("Mensalidade paga com sucesso por" + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }
}
