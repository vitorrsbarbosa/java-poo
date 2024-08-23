import aula02.Caneta;

public class Main {
    public static void main(String[] args) {

        Caneta azul = new Caneta();
        azul.setModelo("Bic Cristal");
        azul.setCor("Azul");
        azul.setPonta(0.5f);
        azul.setCarga(90);
        azul.setTampada(true);

        Caneta preta = new Caneta();
        preta.setModelo("Pilot");
        preta.setCor("Preta");
        preta.setPonta(0.8f);
        preta.setCarga(30);
        preta.setTampada(false);

        azul.status();
        azul.destampar();
        azul.rabiscar();
        preta.status();
        preta.rabiscar();
        preta.destampar();

    }
}