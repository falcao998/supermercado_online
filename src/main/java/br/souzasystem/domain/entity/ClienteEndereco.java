package br.souzasystem.domain.entity;

import br.souzasystem.domain.enums.EnderecoTipo;
import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "TB_CLIENTE_ENDERECO")
public class ClienteEndereco {

    @Id
    @UuidGenerator
    @Column(name = "CLIENTE_ENDERECO_ID")
    private String id;

    @Column(name = "CLIENTE_ENDERECO_RUA", nullable = false)
    private String rua;

    @Column(name = "CLIENTE_ENDERECO_NUMERO", nullable = false)
    private String numero;

    @Column(name = "CLIENTE_ENDERECO_CEP", nullable = false)
    private String cep;

    @Column(name = "CLIENTE_ENDERECO_COMPLEMENTO")
    private String complemento;

    @Column(name = "CLIENTE_ENDERECO_BAIRRO", nullable = false)
    private String bairro;

    @Column(name = "CLIENTE_ENDERECO_CIDADE")
    private String cidade;

    @Column(name = "CLIENTE_ENDERECO_ESTADO")
    private String estado;

    @Column(name = "CLIENTE_ENDERECO_TIPO")
    private EnderecoTipo tipo;

    @ManyToOne
    @JoinColumn(name = "CLIENTE_ID", nullable = false)
    private Cliente cliente;

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
