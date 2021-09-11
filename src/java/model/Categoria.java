package model;

public class Categoria {
    private Long id;
    private Categoria categoriaMae;
    private String nome;
    private String descricao;
    private boolean inativo;
    
    //Constructors
    public Categoria(){}
    
    public Categoria(Long id, Categoria categoriaMae, String nome, String descricao) {
        this.id = id;
        this.categoriaMae = categoriaMae;
        this.nome = nome;
        this.descricao = descricao;
    }
    
    // Getters and Setters
    
   public boolean getInativo() {
        return this.inativo;
    }

    public void setInativo(boolean inativo) {
        this.inativo = inativo;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Categoria getCategoriaMae() {
        return this.categoriaMae;
    }
    
    public void setCategoriaMae(Categoria categoriaMae) {
        this.categoriaMae = categoriaMae;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
}
