package model;

public class Livro {
    private Long id;
    private String nome;
    private String autor;
    private Editora editora;
    private Categoria categoria;
    private int edicao;
    private int numeroPaginas;
    private String idioma;
    private String isbn10;
    private String isbn13;
    private int dimensoesLarguraCm;
    private int dimensoesAlturaCm;
   private EstadoDeConservacao estadoDeConservacao;
    
    //Constructors
    public Livro(){}
    
    public Livro(Long id, String nome, String autor, Editora editora, Categoria categoria, int edicao, int numeroPaginas, String idioma, String isbn10, 
            String isbn13, int dimensoesLarguraCm, int dimensoesAlturaCm, EstadoDeConservacao estadoDeConservacao) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.categoria = categoria;
        this.edicao = edicao;
        this.numeroPaginas = numeroPaginas;
        this.idioma = idioma;
        this.isbn10 = isbn10;
        this.isbn13 = isbn13;
        this.dimensoesAlturaCm = dimensoesAlturaCm;
        this.dimensoesLarguraCm = dimensoesLarguraCm;
        this.estadoDeConservacao = estadoDeConservacao;
    }
    
    // Getters and 
    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }
    
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    public String getAutor() {
        return this.autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public EstadoDeConservacao getEstadoDeConservacao() {
        return this.estadoDeConservacao;
    }
    
    public void setEstadoDeConservacao(EstadoDeConservacao estadoDeConservacao) {
        this.estadoDeConservacao = estadoDeConservacao;
    }
    
    public int getDimensoesAlturaCm() {
        return this.dimensoesAlturaCm;
    }
    
    public void setDimensoesAlturaCm(int dimensoesAlturaCm) {
        this.dimensoesAlturaCm = dimensoesAlturaCm;
    }
    
    public int getDimensoesLarguraCm() {
        return this.dimensoesLarguraCm;
    }
    
    public void setDimensoesLarguraCm(int dimensoesLarguraCm) {
        this.dimensoesLarguraCm = dimensoesLarguraCm;
    }
    
    public String getIsbn13() {
        return this.isbn13;
    }
    
    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }
    
    public String getIsbn10() {
        return this.isbn10;
    }
    
    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }
    
    public String getIdioma() {
        return this.idioma;
    }
    
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    public int getEdicao() {
        return this.edicao;
    }
    
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    
    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public Editora getEditora() {
        return this.editora;
    }
    
    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
}
