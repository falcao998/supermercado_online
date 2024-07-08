package br.souzasystem.domain.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;

@Entity
@Table(name = "TB_CLIENTE")
public class Cliente {

    @Id
    @UuidGenerator
    @Column(name = "CLIENTE_ID")
    private String id;

    @Column(name = "CLIENTE_NOME", nullable = false)
    private String nome;

    @Column(name = "CLIENTE_DOCUMENTO", nullable = false, unique = true)
    private String documento;

    @Column(name = "CLIENTE_TELEFONE")
    private String telefone;

    @Column(name = "CLIENTE_CELULAR", nullable = false)
    private String celular;

    @Column(name = "CLIENTE_LOGIN", nullable = false, unique = true)
    private String login;

    @Column(name = "CLIENTE_SENHA", nullable = false)
    private String senha;

    @Column(name = "CLIENTE_EMAIL", nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "cliente")
    private List<ClienteEndereco> enderecos;

    @OneToMany(mappedBy = "cliente")
    private List<ClientePagamento> pagamentos;

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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ClienteEndereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<ClienteEndereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<ClientePagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<ClientePagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }
}
