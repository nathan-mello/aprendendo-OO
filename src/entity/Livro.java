package entity;


public class Livro extends Produto{
    private String autor;
    private Integer edicao;
    private String editora;
    private EnumIdioma idioma;
    private Integer numeroPaginas;
    private Integer ISBN;

    public Livro(String name, String descricao, String autor, Integer edicao, String editora, EnumIdioma idioma, Integer numeroPaginas) {
        super(name, descricao);
        this.autor = autor;
        this.edicao = edicao;
        this.editora = editora;
        this.idioma = idioma;
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getEdicao() {
        return edicao;
    }

    public void setEdicao(Integer edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public EnumIdioma getIdioma() {
        return idioma;
    }

    public void setIdioma(EnumIdioma idioma) {
        this.idioma = idioma;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

}
