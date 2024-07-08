package br.souzasystem.domain.response;

import java.util.List;

public class ClienteResponse {

    private String id;

    private String nome;

    private String documento;

    private String telefone;

    private String celular;

    private String login;

    private String senha;

    private String email;

    private List<ClienteEnderecoResponse> enderecos;

    private List<ClientePagamentoResponse> pagamentos;

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

    public List<ClienteEnderecoResponse> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<ClienteEnderecoResponse> enderecos) {
        this.enderecos = enderecos;
    }

    public List<ClientePagamentoResponse> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<ClientePagamentoResponse> pagamentos) {
        this.pagamentos = pagamentos;
    }
}
