package br.souzasystem.domain.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "TB_CATEGORIA")
public class ProdutoCategoria {

    @Id
    @Column(name = "CATEGORIA_ID")
    @UuidGenerator
    private String id;

    @Column(name = "CATEGORIA_CODIGO", unique = true, nullable = false)
    private String codigo;

    @Column(name = "CATEGORIA_NOME", unique = true, nullable = false)
    private String nome;

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
}
