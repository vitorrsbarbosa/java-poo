//import aula02.Caneta;
import aula05.conta.ContaBanco;

public class Main {
    public static void main(String[] args) {

//        Caneta azul = new Caneta("Bic Cristal","Azul",0.5f,90,true);

//        Caneta preta = new Caneta("Pilot","Preta",0.8f,30,false);

//        azul.status();
//        azul.destampar();
//        azul.rabiscar();
//        preta.status();
//        preta.rabiscar();
//        preta.destampar();

        ContaBanco pessoa01 = new ContaBanco();
        pessoa01.abrirConta("CC");
        pessoa01.setDono("Jubileu");
        pessoa01.estadoAtual();
        pessoa01.depositar(100);
        pessoa01.estadoAtual();
        pessoa01.sacar(25);
        pessoa01.estadoAtual();
        pessoa01.pagarMensalidade(pessoa01.getTipo());
        pessoa01.estadoAtual();

        ContaBanco pessoa02 = new ContaBanco();
        pessoa02.abrirConta("CP");
        pessoa02.setDono("Dona Ana");
        pessoa02.estadoAtual();
        pessoa02.depositar(500);
        pessoa02.estadoAtual();
        pessoa02.pagarMensalidade(pessoa02.getTipo());
        pessoa02.estadoAtual();
        pessoa02.sacar(630);
        pessoa02.estadoAtual();
        pessoa02.pagarMensalidade(pessoa02.getTipo());
        pessoa02.estadoAtual();
        pessoa02.fecharConta();

        ContaBanco pessoa03 = new ContaBanco();
        pessoa03.abrirConta("CC");
        pessoa03.setDono("Marcelina");
        pessoa03.estadoAtual();
        pessoa03.sacar(25);
        pessoa03.estadoAtual();
        pessoa03.sacar(100);
        pessoa03.fecharConta();
        pessoa03.sacar(25);
        pessoa03.fecharConta();
        pessoa03.sacar(25);
    }
}