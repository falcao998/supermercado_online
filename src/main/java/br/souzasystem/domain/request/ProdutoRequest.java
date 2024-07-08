package br.souzasystem.domain.request;

import br.souzasystem.domain.enums.ProdutoUnidadeMedida;

import java.math.BigDecimal;

public class ProdutoRequest {

    private String id;

    private String nome;

    private String descricao;

    private BigDecimal valor;

    private Integer estoque;

    private ProdutoCategoriaRequest categoria;

    private ProdutoSubCategoriaRequest subCategoria;

    private ProdutoUnidadeMedida unidadeMedida;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public ProdutoCategoriaRequest getCategoria() {
        return categoria;
    }

    public void setCategoria(ProdutoCategoriaRequest categoria) {
        this.categoria = categoria;
    }

    public ProdutoSubCategoriaRequest getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(ProdutoSubCategoriaRequest subCategoria) {
        this.subCategoria = subCategoria;
    }

    public ProdutoUnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(ProdutoUnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
}
