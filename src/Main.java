import aula07.ultraEmojiCombat.Lutador;

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

//        ContaBanco pessoa01 = new ContaBanco();
//        pessoa01.abrirConta("CC");
//        pessoa01.setDono("Jubileu");
//        pessoa01.estadoAtual();
//        pessoa01.depositar(100);
//        pessoa01.estadoAtual();
//        pessoa01.sacar(25);
//        pessoa01.estadoAtual();
//        pessoa01.pagarMensalidade(pessoa01.getTipo());
//        pessoa01.estadoAtual();

//        ContaBanco pessoa02 = new ContaBanco();
//        pessoa02.abrirConta("CP");
//        pessoa02.setDono("Dona Ana");
//        pessoa02.estadoAtual();
//        pessoa02.depositar(500);
//        pessoa02.estadoAtual();
//        pessoa02.pagarMensalidade(pessoa02.getTipo());
//        pessoa02.estadoAtual();
//        pessoa02.sacar(630);
//        pessoa02.estadoAtual();
//        pessoa02.pagarMensalidade(pessoa02.getTipo());
//        pessoa02.estadoAtual();
//        pessoa02.fecharConta();

//        ContaBanco pessoa03 = new ContaBanco();
//        pessoa03.abrirConta("CC");
//        pessoa03.setDono("Marcelina");
//        pessoa03.estadoAtual();
//        pessoa03.sacar(25);
//        pessoa03.estadoAtual();
//        pessoa03.sacar(100);
//        pessoa03.fecharConta();
//        pessoa03.sacar(25);
//        pessoa03.fecharConta();
//        pessoa03.sacar(25);

//        ControleRemoto controle = new ControleRemoto();
//        controle.ligar();
//        controle.play();
//        controle.aumentarVolume(60);
//        controle.desligar();
//        controle.abrirMenu();

        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy","França",31,1.75f,68.9f,11,2,1);
        l[0].apresentarLutador();
        l[1] = new Lutador("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
        l[1].apresentarLutador();
        l[2] = new Lutador("Snapshadow","EUA",35,1.65f,80.9f,12,2,1);
        l[2].apresentarLutador();
        l[3] = new Lutador("Dead Code","Austrália",28,1.93f,81.6f,13,0,2);
        l[3].apresentarLutador();
        l[4] = new Lutador("Ufocolob","Brasil",37,1.7f,119.3f,5,4,3);
        l[4].apresentarLutador();
        l[5] = new Lutador("Nerdaart","EUA",30,1.81f,105.7f,12,2,4);
        l[5].apresentarLutador();

    }
}