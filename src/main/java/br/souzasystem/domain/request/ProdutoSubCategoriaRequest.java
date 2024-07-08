package br.souzasystem.domain.request;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

public class ProdutoSubCategoriaRequest {

    private String id;

    private String codigo;

    private String nome;

    private ProdutoCategoriaRequest categoria;

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

    public ProdutoCategoriaRequest getCategoria() {
        return categoria;
    }

    public void setCategoria(ProdutoCategoriaRequest categoria) {
        this.categoria = categoria;
    }
}
