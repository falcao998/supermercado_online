package br.souzasystem.domain.response;

import br.souzasystem.domain.enums.EnderecoTipo;
import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

public class ClienteEnderecoResponse {

    private String id;

    private String rua;

    private String numero;

    private String cep;

    private String complemento;

    private String bairro;

    private String cidade;

    private String estado;

    private EnderecoTipo tipo;

    private ClienteResponse cliente;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public EnderecoTipo getTipo() {
        return tipo;
    }

    public void setTipo(EnderecoTipo tipo) {
        this.tipo = tipo;
    }

    public ClienteResponse getCliente() {
        return cliente;
    }

    public void setCliente(ClienteResponse cliente) {
        this.cliente = cliente;
    }
}
