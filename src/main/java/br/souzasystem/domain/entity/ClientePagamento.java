package br.souzasystem.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "TB_CLIENTE_PAGAMENTO")
@Getter
@Setter
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
}
