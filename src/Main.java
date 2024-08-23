import aula02.Caneta;

public class Main {
    public static void main(String[] args) {

        Caneta azul = new Caneta("Bic Cristal","Azul",0.5f,90,true);

        Caneta preta = new Caneta("Pilot","Preta",0.8f,30,false);

        azul.status();
        azul.destampar();
        azul.rabiscar();
        preta.status();
        preta.rabiscar();
        preta.destampar();

    }
}