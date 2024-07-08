package br.souzasystem.domain.response;

public class ProdutoSubCategoriaResponse {

    private String id;

    private String codigo;

    private String nome;

    private ProdutoCategoriaResponse categoria;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProdutoCategoriaResponse getCategoria() {
        return categoria;
    }

    public void setCategoria(ProdutoCategoriaResponse categoria) {
        this.categoria = categoria;
    }
}
