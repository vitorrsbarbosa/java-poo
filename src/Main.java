import aula12.polimorfismo.ave.Arara;
import aula12.polimorfismo.mamifero.Cachorro;
import aula12.polimorfismo.mamifero.Canguru;
import aula12.polimorfismo.mamifero.Lobo;
import aula12.polimorfismo.peixe.Beta;
import aula12.polimorfismo.reptil.Cobra;
import aula12.polimorfismo.reptil.Tartaruga;

public class Main {
    public static void main(String[] args) {

//                Caneta azul = new Caneta("Bic Cristal","Azul",0.5f,90,true);

//                Caneta preta = new Caneta("Pilot","Preta",0.8f,30,false);

//                azul.status();
//                azul.destampar();
//                azul.rabiscar();
//                preta.status();
//                preta.rabiscar();
//                preta.destampar();

//                ContaBanco pessoa01 = new ContaBanco();
//                pessoa01.abrirConta("CC");
//                pessoa01.setDono("Jubileu");
//                pessoa01.estadoAtual();
//                pessoa01.depositar(100);
//                pessoa01.estadoAtual();
//                pessoa01.sacar(25);
//                pessoa01.estadoAtual();
//                pessoa01.pagarMensalidade(pessoa01.getTipo());
//                pessoa01.estadoAtual();

//                ContaBanco pessoa02 = new ContaBanco();
//                pessoa02.abrirConta("CP");
//                pessoa02.setDono("Dona Ana");
//                pessoa02.estadoAtual();
//                pessoa02.depositar(500);
//                pessoa02.estadoAtual();
//                pessoa02.pagarMensalidade(pessoa02.getTipo());
//                pessoa02.estadoAtual();
//                pessoa02.sacar(630);
//                pessoa02.estadoAtual();
//                pessoa02.pagarMensalidade(pessoa02.getTipo());
//                pessoa02.estadoAtual();
//                pessoa02.fecharConta();

//                ContaBanco pessoa03 = new ContaBanco();
//                pessoa03.abrirConta("CC");
//                pessoa03.setDono("Marcelina");
//                pessoa03.estadoAtual();
//                pessoa03.sacar(25);
//                pessoa03.estadoAtual();
//                pessoa03.sacar(100);
//                pessoa03.fecharConta();
//                pessoa03.sacar(25);
//                pessoa03.fecharConta();
//                pessoa03.sacar(25);

//                ControleRemoto controle = new ControleRemoto();
//                controle.ligar();
//                controle.play();
//                controle.aumentarVolume(60);
//                controle.desligar();
//                controle.abrirMenu();

//                Lista de lutadores
//                Lutador[] l = new Lutador[6];
//                l[0] = new Lutador("Pretty Boy","França",31,1.75f,68.9f,11,2,1);
//                l[1] = new Lutador("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
//                l[2] = new Lutador("Snapshadow","EUA",35,1.65f,80.9f,12,2,1);
//                l[3] = new Lutador("Dead Code","Austrália",28,1.93f,81.6f,13,0,2);
//                l[4] = new Lutador("Ufocolob","Brasil",37,1.7f,119.3f,5,4,3);
//                l[5] = new Lutador("Nerdaart","EUA",30,1.81f,105.7f,12,2,4);

//                Inicar uma luta
//                Random aleatorio = new Random();
//                List<Integer> listaPar = new ArrayList<>(){{
//                    add(0);
//                    add(2);
//                    add(4);
//                }};
//                List<Integer> listaImpar = new ArrayList<>(){{
//                    add(1);
//                    add(3);
//                    add(5);
//                }};
//                Lutador l1 = l[listaPar.get(aleatorio.nextInt(3))];
//                Lutador l2 = l[listaImpar.get(aleatorio.nextInt(3))];

//                Luta uec01 = new Luta();
//                uec01.marcarLuta(l1, l2);
//                uec01.lutar(l1,l2);

//        Pessoa[] pessoas = new Pessoa[2];
//        Livro[] livros = new Livro[3];

//        pessoas[0] = new Pessoa("Vitor",30,"Masculino");
//        pessoas[1] = new Pessoa("Dayany",32,"Feminino");

//        livros[0] = new Livro("A Arte da Guerra","Sun Tzu",160,pessoas[0]);
//        livros[1] = new Livro("O Programador pragmático", "Andrew Hunt & David Thomas",344,pessoas[0]);
//        livros[2] = new Livro("O Problema dos Três Corpos","Cixin Liu", 320,pessoas[1]);

//        livros[0].abrir();
//        livros[0].folhear(100);
//        livros[0].avancarPagina();

//        Funcionario p1 = new Funcionario( "Vitor",30,"M","Informática",true );
//        Professor p2 = new Professor( "Dayany",32,"F", "Arquitetura",3600f);
//        Aluno p3 = new Aluno( "Arthur",13,"M",111,"Ensino Fundamental" );
//        Funcionario p4 = new Funcionario("Alayde",61,"F","Saúde",true);
//        Visitante p5 = new Visitante("Belchior",70,"M");
//        Bolsista p6 = new Bolsista("João",18,"M",112,"Medicina",true,2500f);
//        Tecnico p7 = new Tecnico("Janaina",25,"F",113,"Veterinária");

//        p1.mudarTrabalho();
//        p2.receberAumento(600f);
//        p3.pagarMensalidade();
//        p6.pagarMensalidade();
//        p7.pagarMensalidade();
//        p4.mudarTrabalho();
//        p5.fazerAniversario();
//        p6.renovarBolsa();
//        p7.fazerAniversario();


//        System.out.println("-------------------------");

//        p1.status();
//        p2.status();
//        p3.status();
//        p4.status();
//        p5.status();
//        p6.status();
//        p7.status();

//        System.out.println(p1.toString());
//        System.out.println(p2.toString());
//        System.out.println(p3.toString());
//        System.out.println(p4.toString());
//        System.out.println(p5.toString());
//        System.out.println(p6.toString());
//        System.out.println(p7.toString());

        Canguru canguru = new Canguru( 120f, 15, 4, "Marrom claro" );
        Cachorro cachorro = new Cachorro( 45f, 5, 4, "Preto e branco" );
        Lobo lobo = new Lobo( 45f, 10, 4, "Preto" );
        Arara arara = new Arara( 15f, 50, 2, "Amarelo" );
        Beta beta = new Beta( 0.25f, 0, 0, "Dourado" );
        Cobra cobra = new Cobra( 10f, 3, 0, "Verde" );
        Tartaruga tartaruga = new Tartaruga( 150f, 150, 4, "Verde" );

        canguru.locomover( );
        cachorro.locomover( );
        lobo.locomover( );
        arara.locomover( );
        beta.locomover( );
        cobra.locomover( );
        tartaruga.locomover( );

        canguru.emitirSom( );
        cachorro.emitirSom( );
        lobo.emitirSom( );
        arara.emitirSom( );
        beta.emitirSom( );
        cobra.emitirSom( );
        tartaruga.emitirSom( );
    }
}
