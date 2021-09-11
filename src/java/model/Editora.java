package model;

public class Editora {
    private Long id;
    private String nome;
    private String nomeRepresentante;
    private String cnpj;
    private boolean inativo;
    private String endereco;
    private String cidade;
    private String uf;
    private String telefone1;
    private String telefone2;
    
   
    //Constructors
    public Editora(){}
    public Editora(Long id, String nome, String nomeRepresentante, String cnpj, String endereco, String cidade, String uf, String telefone1, String telefone2, boolean inativo) {    
        this.id = id;
        this.nome = nome;
        this.nomeRepresentante = nomeRepresentante;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.cidade = cidade;
        this.uf = uf;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
    }

    //Getters and Setters
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }
    
    public boolean getInativo() {
        return this.inativo;
    }
    
    public void setInativo(boolean inativo) {
        this.inativo = inativo;
    }
    
    
}
