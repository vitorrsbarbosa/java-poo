package aula07.ultraEmojiCombat;

import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador desafiante,Lutador desafiado){
        if(desafiante != desafiado &&
           Objects.equals(desafiante.getCategoria(), desafiado.getCategoria())){
            this.setAprovada(true);
            this.desafiante = desafiante;
            this.desafiado = desafiado;
        } else {
            this.setAprovada(false);
            this.desafiante = null;
            this.desafiado = null;
        }
    }
    public void lutar(Lutador desafiante,Lutador desafiado){
        if(this.isAprovada()) {
        desafiado.apresentarLutador();
        desafiante.apresentarLutador();

        Random aleatorio = new Random();
        int resultado = aleatorio.nextInt(3);
        switch (resultado){
            case 0:
                System.out.println("Empatou!");
                desafiante.empatarLuta();
                desafiado.empatarLuta();
                break;
            case 1:
                System.out.println(desafiante.getNome() + " ganhou!");
                desafiante.ganharLuta();
                desafiado.perderLuta();
                System.out.println("O RESULTADO É O SEGUINTE:");
                System.out.println("AGORA TEMOS O NOVO VENCEDOR");
                System.out.println("E O NOME DELE É......");
                System.out.println(desafiante.getNome().toUpperCase());
                desafiante.status();
                break;
            case 2:
                System.out.println(desafiado.getNome() + " ganhou!");
                desafiante.perderLuta();
                desafiado.ganharLuta();
                System.out.println("O RESULTADO É O SEGUINTE:");
                System.out.println("AGORA TEMOS O NOVO VENCEDOR");
                System.out.println("E O NOME DELE É......");
                System.out.println(desafiado.getNome().toUpperCase());
                desafiado.status();
                break;
            default: System.out.println("Resultado inválido");
        }
        } else {
            System.out.println("Luta não pode acontecer.");
        }

    }
    public void apresentarResultado(Lutador desafiante,Lutador desafiado){

    }
}
