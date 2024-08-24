package aula06.controle;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public void ligar() {
        this.setLigado(true);
    }
    public void desligar() {
        this.setLigado(false);
    }
    public void abrirMenu() {
        System.out.println(this.isLigado());
        System.out.println(this.getVolume());
        for(int i = 0; i < this.getVolume(); i++){
            System.out.print("|");
        }
        System.out.println(this.isTocando());
    }
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }
    public void aumentarVolume() {
        if(this.isLigado()) {
            this.setVolume(this.getVolume() + 1);
        }
    }
    public void diminuirVolume() {
        if(this.isLigado()) {
            this.setVolume(this.getVolume() - 1);
        }
    }
    public void ligarMudo() {
        if(this.isLigado() && !this.isTocando() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }
    public void desligarMudo() {
        if(this.isLigado() && this.isTocando() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }
    public void play() {
        if(this.isLigado() && !this.isTocando()) {
            this.setTocando(true);
        }
    }
    public void pause() {
        if(this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }
    }
}
