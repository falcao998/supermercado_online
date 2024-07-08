package br.souzasystem.domain.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "TB_SUB_CATEGORIA")
public class ProdutoSubCategoria {

    @Id
    @UuidGenerator
    @Column(name = "SUB_CATEGORIA_ID")
    private String id;

    @Column(name = "SUB_CATEGORIA_CODIGO", unique = true, nullable = false)
    private String codigo;

    @Column(name = "SUB_CATEGORIA_NOME", nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "CATEGORIA_ID")
    private ProdutoCategoria categoria;

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

    public ProdutoCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(ProdutoCategoria categoria) {
        this.categoria = categoria;
    }
}
