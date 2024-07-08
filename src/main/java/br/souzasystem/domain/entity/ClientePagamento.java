package br.souzasystem.domain.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "TB_CLIENTE_PAGAMENTO")
public class ClientePagamento {

    @Id
    @UuidGenerator
    @Column(name = "CLIENTE_PAGAMENTO_ID")
    private String id;

    @Column(name = "CLIENTE_PAGAMENTO_NUMERO_CARTAO", nullable = false, unique = true)
    private String numeroCartao;

    @Column(name = "CLIENTE_PAGAMENTO_NUMERO_NOME_CARTAO", nullable = false)
    private String nomeCartao;

    @Column(name = "CLIENTE_PAGAMENTO_NUMERO_APELIDO_CARTAO")
    private String apelidoCartao;

    @Column(name = "CLIENTE_PAGAMENTO_NUMERO_VALIDADE_CARTAO", nullable = false)
    private String validadeCartao;

    @ManyToOne
    @JoinColumn(name = "CLIENTE_ID", nullable = false)
    private Cliente cliente;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public String getApelidoCartao() {
        return apelidoCartao;
    }

    public void setApelidoCartao(String apelidoCartao) {
        this.apelidoCartao = apelidoCartao;
    }

    public String getValidadeCartao() {
        return validadeCartao;
    }

    public void setValidadeCartao(String validadeCartao) {
        this.validadeCartao = validadeCartao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
