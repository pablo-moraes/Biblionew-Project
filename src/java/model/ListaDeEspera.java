package model;

import java.util.Calendar;

public class ListaDeEspera {

    private Long id;
    private Livro livro;
    private Usuario usuario;
    private int posicaoFila;
    private Calendar dataEntradaLista;
    private Calendar dataSaidaLista;
    
    private enum motivo {
        Emprestimo, Desistencia;

        public static motivo getEmprestimo() {
            return Emprestimo;
        }

        public static motivo getDesistencia() {
            return Desistencia;
        }
    }

    //Constructor
    public ListaDeEspera() {
    }

    public ListaDeEspera(Long id, Livro livro, Usuario usuario, int posicaoFila, Calendar dataEntradaLista, Calendar dataSaidaLista) {
        this.id = id;
        this.livro = livro;
        this.usuario = usuario;
        this.posicaoFila = posicaoFila;
        this.dataEntradaLista = dataEntradaLista;
        this.dataSaidaLista = dataSaidaLista;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getPosicaoFila() {
        return posicaoFila;
    }

    public void setPosicaoFila(int posicaoFila) {
        this.posicaoFila = posicaoFila;
    }

    public Calendar getDataEntradaLista() {
        return dataEntradaLista;
    }

    public void setDataEntradaLista(Calendar dataEntradaLista) {
        this.dataEntradaLista = dataEntradaLista;
    }

    public Calendar getDataSaidaLista() {
        return dataSaidaLista;
    }

    public void setDataSaidaLista(Calendar dataSaidaLista) {
        this.dataSaidaLista = dataSaidaLista;
    }

}
