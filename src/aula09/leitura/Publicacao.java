package aula09.leitura;

public interface Publicacao {
    void abrir( );
    void fechar( );
    void folhear( int pagina );
    void avancarPagina( );
    void voltarPagina( );
}
