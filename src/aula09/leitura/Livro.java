package aula09.leitura;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalDePaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalDePaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotalDePaginas(totalDePaginas);
        this.setPaginaAtual(0);
        this.setAberto(false);
        this.setLeitor(leitor);
    }

    public String detalhes() {
        return "Livro{\n" +
                "    titulo = '" + titulo + '\'' + ",\n" +
                "    autor = '" + autor + '\'' + ",\n" +
                "    totalDePaginas = " + totalDePaginas + ",\n" +
                "    paginaAtual = " + paginaAtual + ",\n" +
                "    aberto = " + aberto + ",\n" +
                "    leitor = " + leitor.getNome() + "\n" +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalDePaginas() {
        return totalDePaginas;
    }

    public void setTotalDePaginas(int totalDePaginas) {
        this.totalDePaginas = totalDePaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if(!this.isAberto()){
            this.setAberto(true);
            System.out.println("Abrindo livro...");
        } else {
            System.out.println("Livro já está aberto");
        }
    }

    @Override
    public void fechar() {
        if( this.isAberto() ){
            this.setAberto(false);
            System.out.println("Fechando livro...");
        } else {
            System.out.println("Livro já está fechado");
        }
    }

    @Override
    public void folhear(int pagina) {
        if(this.isAberto()) {
            if(pagina < this.getTotalDePaginas()) {
                this.setPaginaAtual( pagina );
                System.out.println("Agora você está na página " + this.getPaginaAtual());
            } else {
                System.out.println( "Não é possível folhear além das " + this.getTotalDePaginas() + " páginas do livro" );
            }
        } else {
            System.out.println("O Livro " + this.getTitulo() + " está fechado");
        }
    }

    @Override
    public void avancarPagina() {
        if(this.isAberto() && this.getPaginaAtual() < this.getTotalDePaginas()){
            this.setPaginaAtual(this.getPaginaAtual()+1);
            System.out.println("Próxima página..");
            System.out.println("Agora você está na página " + this.getPaginaAtual());
        } else {
            System.out.println("Você chegou ao fim do livro");
        }
    }

    @Override
    public void voltarPagina() {
        if(this.isAberto() && this.getPaginaAtual() > 0){
            this.setPaginaAtual(this.getPaginaAtual()-1);
            System.out.println("Página anterior..");
            System.out.println("Agora você está na página " + this.getPaginaAtual());
        } else {
            System.out.println("Não é possível voltar mais uma página");
        }
    }
}
