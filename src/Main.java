import aula02.Caneta;

public class Main {
    public static void main(String[] args) {

        Caneta azul = new Caneta();
        azul.modelo = "BIC";
        azul.cor = "Azul";
//        azul.ponta = 0.5f;
//        azul.carga = 90;
//        azul.tampada = true;

        Caneta preta = new Caneta();
        preta.modelo = "Pilot";
        preta.cor = "Preta";
//        preta.ponta = 0.8f;
//        preta.carga = 30;
//        preta.tampada = false;

        azul.status();
        azul.destampar();
        azul.rabiscar();
        preta.status();
        preta.rabiscar();
        preta.destampar();

    }
}