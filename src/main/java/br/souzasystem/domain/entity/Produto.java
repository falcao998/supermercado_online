package br.souzasystem.domain.entity;

import br.souzasystem.domain.enums.ProdutoUnidadeMedida;
import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {

    @Id
    @UuidGenerator
    @Column(name = "PRODUTO_ID")
    private String id;

    @Column(name = "PRODUTO_NAME", nullable = false)
    private String nome;

    @Column(name = "PRODUTO_DESCRICAO")
    private String descricao;

    @Column(name = "PRODUTO_VALOR", nullable = false, precision = 2)
    private BigDecimal valor;

    @Column(name = "PRODUTO_ESTOQUE", nullable = false)
    private Integer estoque;

    @ManyToOne
    @JoinColumn(name = "CATEGORIA_ID", nullable = false)
    private ProdutoCategoria categoria;

    @ManyToOne
    @JoinColumn(name = "SUB_CATEGORIA_ID", nullable = false)
    private ProdutoSubCategoria subCategoria;

    @Column(name = "PRODUTO_UNIDADE_MEDIDA", nullable = false)
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

    public ProdutoCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(ProdutoCategoria categoria) {
        this.categoria = categoria;
    }

    public ProdutoSubCategoria getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(ProdutoSubCategoria subCategoria) {
        this.subCategoria = subCategoria;
    }

    public ProdutoUnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(ProdutoUnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
}
