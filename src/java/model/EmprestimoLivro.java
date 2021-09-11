 package model;

import java.util.Calendar;

public class EmprestimoLivro {
    private Livro livro;
    private Usuario usuario;
    private Calendar dataEmprestimo;
    private Calendar dataDevolucao;
    private String observacoesEmprestimo;
    private String observacoesDevolucao;
    
    //Constructors
    public EmprestimoLivro(){}
    
    public EmprestimoLivro(Livro livro, Usuario usuario, Calendar dataEmprestimo, Calendar dataDevolucao, 
            String observacoesEmprestimo, String observacoesDevolucao) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataDevolucao = dataDevolucao;
        this.dataEmprestimo = dataEmprestimo;
        this.observacoesDevolucao = observacoesDevolucao;
        this.observacoesEmprestimo = observacoesEmprestimo;
    }
    
    
    //Getters and Setters
    public String getObservacoesDevolucao() {
        return this.observacoesDevolucao;
    }
    
    public void setObservacoesDevolucao(String observacoesDevolucao) {
        this.observacoesDevolucao = observacoesDevolucao;
    }
    
    public String getObservacoesEmprestimo() {
        return this.observacoesEmprestimo;
    }
    
    public void setObservacoesEmprestimo(String observacoesEmprestimo) {
        this.observacoesEmprestimo = observacoesEmprestimo;
    }
    
    public Calendar getDataDevolucao() {
        return this.dataDevolucao;
    }
    
    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    public Calendar getDataEmprestimo() {
        return this.dataEmprestimo;
    }
    
    public void setDataEmprestimo(Calendar dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Livro getLivro() {
        return this.livro;
    }
    
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
