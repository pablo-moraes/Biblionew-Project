package model;

public class Usuario {
    private Long id;
    private String nomeCompleto;
    private boolean bibliotecario;
    private boolean chefeDeBiblioteca;
    private String login;
    private String senha;
    private boolean inativo;
    private String rg;
    private String cpf;
    private String fotografia;
    private String telefone;
    private String endereco;
    private String cidade;
    private String uf;
    
    //Constructors
    public Usuario(){}
    
    public Usuario(Long id, String nomeCompleto, boolean bibliotecario, boolean chefeDeBiblioteca, String login, String senha,  
            boolean inativo, String rg, String cpf, String fotografia, String telefone, String endereco, String cidade, String uf) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.bibliotecario = bibliotecario;
        this.chefeDeBiblioteca = chefeDeBiblioteca;
        this.login = login;
        this.senha = senha;
        this.inativo = inativo;
        this.rg = rg;
        this.cpf = cpf;
        this.fotografia = fotografia;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
        this.uf = uf;
    }
    
    //Getters and Setters
    public String getUf() {
        return this.uf;
    }
    
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade)  {
        this.cidade = cidade;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getFotografia() {
        return this.fotografia;
    }
    
    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getRg() {
        return this.rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public boolean getInativo() {
        return this.inativo;
    }
    
    public void setInativo(boolean inativo) {
        this.inativo = inativo;
    }
    
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public boolean getChefeDeBiblioteca() {
        return this.chefeDeBiblioteca;
    }
    
    public void setChefeDeBiblioteca(boolean chefeDeBiblioteca) {
        this.chefeDeBiblioteca = chefeDeBiblioteca;
    }
    
    public boolean getBibliotecario() {
        return this.bibliotecario;
    }
    
    public void setBibliotecario(boolean bibliotecario) {
        this.bibliotecario = bibliotecario;
    }
    
    public String getNomeCompleto() {
        return this.nomeCompleto;
    }
    
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
}
