package model;

public class EstadoDeConservacao {
    private Long id;
    private int estadoDeConservacao;
    private String observacao;
    
    //Constructors
    public EstadoDeConservacao(){}
    
    public EstadoDeConservacao(Long id, int estadoDeConservacao, String observacao) {
        this.id = id;
        this.estadoDeConservacao = estadoDeConservacao;
        this.observacao = observacao;
    }
    
    //Getters and Setters
    public String getObservacao() {
        return this.observacao;
    }
    
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public int getEstadoDeConservacao() {
        return this.estadoDeConservacao;
    }
    
    public void setEstadoDeConservacao(int estadoDeConservacao) {
        this.estadoDeConservacao = estadoDeConservacao;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
}
