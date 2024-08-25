package aula06.controle;

public interface Controlador {
    abstract void ligar();
    abstract void desligar();
    abstract void abrirMenu();
    abstract void fecharMenu();
    abstract void aumentarVolume();
    abstract void aumentarVolume(int valor);
    abstract void diminuirVolume();
    abstract void ligarMudo();
    abstract void desligarMudo();
    abstract void play();
    abstract void pause();
}
