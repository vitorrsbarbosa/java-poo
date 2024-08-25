package aula06.controle;

public class ControleRemoto implements Controlador{

//    Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

//    Construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

//    Getters e Setters
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

//    Métodos abstratos

    public void ligar() {
        System.out.println("Ligando");
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        System.out.println("Desligando");
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()) {
            System.out.println("Abrindo menu");
            System.out.println("No momento está ligado? " + this.isLigado());
            System.out.println("O volume atual é: " + this.getVolume());
            for (int i = 10; i <= this.getVolume(); i += 10) {
                System.out.print("[" + i + "]");
            }
            System.out.println("\n");
            System.out.println("Está tocando algo? " + this.isTocando());
        } else {
            System.out.println("Quando desligado menu não pode ser aberto");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("-x-x-x-x-x-x-");
        System.out.println("-------------");
        System.out.println("Fechando menu");
        System.out.println("-------------");
        System.out.println("-x-x-x-x-x-x-");
    }

    @Override
    public void aumentarVolume() {
        if(this.isLigado() && (this.getVolume() < 100)) {
            this.setVolume(this.getVolume() + 10);
        } else {
            System.out.println("Volume não pode ser superior a 100%");
        }
    }

    @Override
    public void aumentarVolume(int valor) {
        if(this.isLigado() && (this.getVolume()+valor <= 100 )) {
            this.setVolume(this.getVolume() + valor);
        } else {
            System.out.println("Volume não pode ser superior a 100%");
        }
    }

    @Override
    public void diminuirVolume() {
        if(this.isLigado()) {
            this.setVolume(this.getVolume() - 10);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.isTocando() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.isTocando() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }
    }
}
